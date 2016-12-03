/*
 * Copyright 2016 The Apache Software Foundation.
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
 */
package org.apache.mrql;

import java.io.DataInput;
import java.io.DataOutput;
import java.io.IOException;
import java.io.ObjectOutputStream;
import org.apache.storm.trident.Stream;

public class MR_stream extends MRData{
    Stream stream;

    public MR_stream() {
    }

    public MR_stream(Stream stream) {
        this.stream = stream;
    }
    
    public Stream stream(){
        return this.stream;
    }
    
    @Override
    public void materializeAll() {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public void write(DataOutput d) throws IOException {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public void readFields(DataInput di) throws IOException {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public int compareTo(MRData o) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public void writeData(ObjectOutputStream arg0) throws IOException {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    
}
