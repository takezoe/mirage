/*
 * Copyright 2004-2010 the Seasar Foundation and the Others.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND,
 * either express or implied. See the License for the specific language
 * governing permissions and limitations under the License.
 */
package jp.sf.amateras.mirage.parser;

/**
 * Node Interface representing the individual elements that make up an <code>SQL</code>
 * 
 * @author higa
 */
public interface Node {

    /**
     * 子供の要素数を返します。
     * 
     * @return 要素数
     */
    int getChildSize();

    /**
     * 指定されたインデックス番号<code>index</code>の<code>Node</code>を返します。
     * 
     * @param index the index
     * @return the child node at the specified index
     */
    Node getChild(int index);

    /**
     * 子供の<code>Node</code>を追加します。
     * 
     * @param node the node to add as child
     */
    void addChild(Node node);

    /**
     * <code>CommandContext</code>をこの<code>Node</code>に、 適用します。
     * 
     * @param ctx
     */
    void accept(SqlContext ctx);
}