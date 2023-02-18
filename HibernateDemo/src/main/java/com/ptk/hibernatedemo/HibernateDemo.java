/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */
package com.ptk.hibernatedemo;

import com.ptk.pojo.Category;
import java.util.List;
import javax.persistence.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;

/**
 *
 * @author admin
 */
public class HibernateDemo {

    public static void main(String[] args) {
        SessionFactory factory = HibernateUtils.getFactory();
        Session session = factory.openSession();
        Category c = session.get(Category.class, 1);
        try {
            Query q = session.createQuery("FROM Category");
            
        } catch (Exception e) {
        }
        
    }
}
