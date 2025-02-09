/*~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
 ~ Copyright 2020 Adobe
 ~
 ~ Licensed under the Apache License, Version 2.0 (the "License");
 ~ you may not use this file except in compliance with the License.
 ~ You may obtain a copy of the License at
 ~
 ~     http://www.apache.org/licenses/LICENSE-2.0
 ~
 ~ Unless required by applicable law or agreed to in writing, software
 ~ distributed under the License is distributed on an "AS IS" BASIS,
 ~ WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 ~ See the License for the specific language governing permissions and
 ~ limitations under the License.
 ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~*/
package com.adobe.cq.commerce.core.search.internal.models;

import java.util.List;

import com.adobe.cq.commerce.core.search.models.Sorter;
import com.adobe.cq.commerce.core.search.models.SorterKey;

public class SorterImpl implements Sorter {

    private List<SorterKey> keys;
    private SorterKey currentKey;

    @Override
    public List<SorterKey> getKeys() {
        return keys; //NOSONAR
    }

    public void setKeys(List<SorterKey> keys) {
        this.keys = keys; //NOSONAR
    }

    @Override
    public SorterKey getCurrentKey() {
        return currentKey;
    }

    public void setCurrentKey(SorterKey currentKey) {
        this.currentKey = currentKey;
    }
}
