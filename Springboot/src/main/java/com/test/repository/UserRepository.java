/**
 * 
 */
package com.test.repository;

import org.springframework.stereotype.Repository;

/**
 * @author Prasad_Bonam
 *
 */
@Repository
public class UserRepository {
    public static String getUserName(int userId) {
        // Database query
        return "Spring boot microservice";
    }
}