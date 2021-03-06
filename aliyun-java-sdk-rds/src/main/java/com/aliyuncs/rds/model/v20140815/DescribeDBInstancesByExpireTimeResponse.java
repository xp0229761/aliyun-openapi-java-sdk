/*
 * Licensed to the Apache Software Foundation (ASF) under one
 * or more contributor license agreements.  See the NOTICE file
 * distributed with this work for additional information
 * regarding copyright ownership.  The ASF licenses this file
 * to you under the Apache License, Version 2.0 (the
 * "License"); you may not use this file except in compliance
 * with the License.  You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing,
 * software distributed under the License is distributed on an
 * "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY
 * KIND, either express or implied.  See the License for the
 * specific language governing permissions and limitations
 * under the License.
 */
package com.aliyuncs.rds.model.v20140815;

import com.aliyuncs.AcsResponse;
import com.aliyuncs.rds.transform.v20140815.DescribeDBInstancesByExpireTimeResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

import java.util.List;

/**
 * @author auto create
 */
public class DescribeDBInstancesByExpireTimeResponse extends AcsResponse {

    private String requestId;

    private Integer pageNumber;

    private Integer totalRecordCount;

    private Integer pageRecordCount;

    private List<DBInstanceExpireTime> items;

    public String getRequestId() {
        return this.requestId;
    }

    public void setRequestId(String requestId) {
        this.requestId = requestId;
    }

    public Integer getPageNumber() {
        return this.pageNumber;
    }

    public void setPageNumber(Integer pageNumber) {
        this.pageNumber = pageNumber;
    }

    public Integer getTotalRecordCount() {
        return this.totalRecordCount;
    }

    public void setTotalRecordCount(Integer totalRecordCount) {
        this.totalRecordCount = totalRecordCount;
    }

    public Integer getPageRecordCount() {
        return this.pageRecordCount;
    }

    public void setPageRecordCount(Integer pageRecordCount) {
        this.pageRecordCount = pageRecordCount;
    }

    public List<DBInstanceExpireTime> getItems() {
        return this.items;
    }

    public void setItems(List<DBInstanceExpireTime> items) {
        this.items = items;
    }

    public static class DBInstanceExpireTime {

        private String dBInstanceId;

        private String dBInstanceDescription;

        private String expireTime;

        public String getDBInstanceId() {
            return this.dBInstanceId;
        }

        public void setDBInstanceId(String dBInstanceId) {
            this.dBInstanceId = dBInstanceId;
        }

        public String getDBInstanceDescription() {
            return this.dBInstanceDescription;
        }

        public void setDBInstanceDescription(String dBInstanceDescription) {
            this.dBInstanceDescription = dBInstanceDescription;
        }

        public String getExpireTime() {
            return this.expireTime;
        }

        public void setExpireTime(String expireTime) {
            this.expireTime = expireTime;
        }
    }

    @Override
    public DescribeDBInstancesByExpireTimeResponse getInstance(UnmarshallerContext context) {
        return DescribeDBInstancesByExpireTimeResponseUnmarshaller.unmarshall(this, context);
    }
}
