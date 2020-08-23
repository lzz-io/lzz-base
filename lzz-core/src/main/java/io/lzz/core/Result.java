/*
 * Copyright 2020 lzz.io,q1219331697
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package io.lzz.core;

import java.io.Serializable;

/**
 * 返回结果
 */
public class Result<T> implements Serializable {

	private static final long serialVersionUID = -3894695258159040884L;

	private String code;
	private String msg;
	private T data;

	public Result() {
	}

	public Result(String code, T data) {
		this.code = code; this.data = data;
	}

	public Result(String code, String msg) {
		this.code = code; this.msg = msg;
	}

	public Result(String code, String msg, T data) {
		this.code = code; this.msg = msg; this.data = data;
	}

	public String getCode() {
		return code;
	}

	public void setCode(String code) {
		this.code = code;
	}

	public String getMsg() {
		return msg;
	}

	public void setMsg(String msg) {
		this.msg = msg;
	}

	public T getData() {
		return data;
	}

	public void setData(T data) {
		this.data = data;
	}

	@Override
	public boolean equals(Object o) {
		if (this == o)
			return true; if (o == null || getClass() != o.getClass())
			return false;

		Result<?> result = (Result<?>) o;

		if (code != null ? !code.equals(result.code) : result.code != null)
			return false; if (msg != null ? !msg.equals(result.msg) : result.msg != null)
			return false; return data != null ? data.equals(result.data) : result.data == null;
	}

	@Override
	public int hashCode() {
		int result = code != null ? code.hashCode() : 0; result = 31 * result + (msg != null ? msg.hashCode() : 0);
		result = 31 * result + (data != null ? data.hashCode() : 0); return result;
	}

	@Override
	public String toString() {
		return "Result{" + "code='" + code + '\'' + ", msg='" + msg + '\'' + ", data=" + data + '}';
	}
}
