/**
 * Copyright (C) 2012 Ness Computing, Inc.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.nesscomputing.migratory.jdbi;

import java.net.URI;

import org.joda.time.DateTime;

public final class JdbiArguments
{
    private JdbiArguments()
    {
    }

    public static <U extends Enum<U>> EnumArgument<U> forEnum(final Enum<U> enumValue)
    {
    	return new EnumArgument<U>(enumValue);
    }

    public static URIArgument forURI(final URI uri)
    {
    	return new URIArgument(uri);
    }

    public static DateTimeArgument forDateTime(final DateTime dateTime)
    {
    	return new DateTimeArgument(dateTime);
    }
}

