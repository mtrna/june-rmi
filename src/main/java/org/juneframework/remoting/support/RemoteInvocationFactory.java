/*
 * Copyright 2002-2007 the original author or authors.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      https://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package org.juneframework.remoting.support;

import org.aopalliance.intercept.MethodInvocation;
import org.juneframework.remoting.httpinvoker.HttpInvokerClientInterceptor;
import org.juneframework.remoting.rmi.RmiClientInterceptor;

/**
 * Strategy interface for creating a {@link RemoteInvocation} from an AOP Alliance
 * {@link org.aopalliance.intercept.MethodInvocation}.
 *
 * <p>Used by {@link RmiClientInterceptor} (for RMI invokers)
 * and by {@link HttpInvokerClientInterceptor}.
 *
 * @author Juergen Hoeller
 * @since 1.1
 * @see DefaultRemoteInvocationFactory
 * @see RmiClientInterceptor#setRemoteInvocationFactory
 * @see HttpInvokerClientInterceptor#setRemoteInvocationFactory
 */
public interface RemoteInvocationFactory {

	/**
	 * Create a serializable RemoteInvocation object from the given AOP
	 * MethodInvocation.
	 * <p>Can be implemented to add custom context information to the
	 * remote invocation, for example user credentials.
	 * @param methodInvocation the original AOP MethodInvocation object
	 * @return the RemoteInvocation object
	 */
	RemoteInvocation createRemoteInvocation(MethodInvocation methodInvocation);

}
