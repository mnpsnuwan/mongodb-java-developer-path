/*
 * Copyright (c) 2023. IMATRIXLABS (PVT) LTD. All Rights Reserved.
 *
 * This software is the confidential and proprietary information of IMATRIXLABS
 * (PVT) LTD. ("Confidential Information"). You shall not disclose
 * such Confidential Information and shall use it only in accordance with the
 * terms of the license agreement you entered into with IMATRIXLABS (PVT) LTD.
 *
 */
package com.mongodb.quickstart;

import com.mongodb.client.MongoClient;
import com.mongodb.client.MongoClients;
import org.bson.Document;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by IntelliJ IDEA.
 * Project : mongodb-java-developer-path
 * Class : {@link Connection}
 * User : Nuwan Samarasinghe
 * Date : 26Oct2023
 * Time : 1:06 PM
 */
public class Connection
{
    public static void main(String[] args) {
        String connectionString = System.getProperty("mongodb.uri");
        try ( MongoClient mongoClient = MongoClients.create(connectionString)) {
            List<Document> databases = mongoClient.listDatabases().into(new ArrayList<>());
            databases.forEach(db -> System.out.println(db.toJson()));
        }
    }
}
