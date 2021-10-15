/*
 * Datart
 * <p>
 * Copyright 2021
 * <p>
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 * <p>
 * http://www.apache.org/licenses/LICENSE-2.0
 * <p>
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package datart.core.data.provider.sql;

import lombok.Data;

@Data
public class OrderOperator implements Operator {

    private String column;

    private AggregateOperator.SqlOperator aggOperator;

    private SqlOperator operator;

    public enum SqlOperator {
        ASC,
        DESC
    }

    @Override
    public String toString() {
        return "OrderOperator{" +
                "column='" + column + '\'' +
                ", operator=" + operator +
                '}';
    }
}
