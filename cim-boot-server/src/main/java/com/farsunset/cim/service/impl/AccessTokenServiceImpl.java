/*
 * Copyright 2013-2019 Xia Jun(3979434@qq.com).
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 *
 ***************************************************************************************
 *                                                                                     *
 *                        Website : http://www.farsunset.com                           *
 *                                                                                     *
 ***************************************************************************************
 */
package com.farsunset.cim.service.impl;

import com.farsunset.cim.component.redis.TokenRedisTemplate;
import com.farsunset.cim.service.AccessTokenService;
import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.UUID;

@Service
public class AccessTokenServiceImpl implements AccessTokenService {
	@Resource
	@Qualifier("primaryDataSource")
	private TokenRedisTemplate tokenRedisTemplate;

	@Override
	public String getUid(String token) {
		if (StringUtils.isBlank(token)){
			return null;
		}
		return tokenRedisTemplate.get(token);
	}

	@Override
	public void delete(String token) {
		tokenRedisTemplate.delete(token);
	}

	/**
	 * 方便调试，这里生成token为永不过期
	 * @param uid
	 * @return
	 */
	@Override
	public String generate(String uid) {
		String newToken = UUID.randomUUID().toString().replace("-","");
		tokenRedisTemplate.save(newToken, uid);
		return newToken;
	}

}
