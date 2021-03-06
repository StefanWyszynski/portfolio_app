package com.portfolio_app.base;

/*
 * Copyright 2018, The Portfolio project
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
 * @author Stefan Wyszynski
 */
public class DownloadResult<R> {
    public R result;
    public ResultStatus status;

    public DownloadResult(R result, ResultStatus status) {
        this.result = result;
        this.status = status;
    }

    public static <R> DownloadResult success(R resultObject) {
        return new DownloadResult<>(resultObject, ResultStatus.SUCCESS);
    }

    public static <R> DownloadResult failure() {
        return new DownloadResult<>(null, ResultStatus.FAILURE);
    }

    public static <R> DownloadResult loaded(R resultObject) {
        return new DownloadResult<>(resultObject, ResultStatus.LOADED);
    }

    public enum ResultStatus {
        SUCCESS, LOADED, FAILURE
    }
}