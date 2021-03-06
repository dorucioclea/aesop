/*******************************************************************************
 *
 * Copyright 2012-2015, the original author or authors.
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obta a copy of the License at
 *      http://www.apache.org/licenses/LICENSE-2.0
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 *  
 *******************************************************************************/
package com.flipkart.aesop.hbasedatalayer.upsert;

import java.util.Map;

import org.springframework.jdbc.core.namedparam.NamedParameterJdbcTemplate;

import com.flipkart.aesop.hbasedatalayer.AbstractHBaseDataLayerFactory;
import com.flipkart.aesop.hbasedatalayer.delete.HBaseDeleteDataLayerFactory;

/**
 * Generates objects of {@link HBaseUpsertDataLayer} and ensures that it is singleton.
 * @author Prakhar Jain
 * @see HBaseDeleteDataLayerFactory
 */
public class HBaseUpsertDataLayerFactory extends AbstractHBaseDataLayerFactory<HBaseUpsertDataLayer>
{
	@Override
	public HBaseUpsertDataLayer createDestinationOperationHandler(
	        Map<String, NamedParameterJdbcTemplate> jdbcTemplateMap)
	{
		return new HBaseUpsertDataLayer(jdbcTemplateMap);
	}

	@Override
	public Class<HBaseUpsertDataLayer> getObjectType()
	{
		return HBaseUpsertDataLayer.class;
	}

}
