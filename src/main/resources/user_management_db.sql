
    CREATE DATABASE user_management_db;
    USE user_management_db;
    
    CREATE TABLE user_registration (
        id INT PRIMARY KEY AUTO_INCREMENT,
        username VARCHAR(50) NOT NULL,
        password VARCHAR(50) NOT NULL,
        email VARCHAR(50) NOT NULL,
        phone_number VARCHAR(20) NOT NULL,
        created_at TIMESTAMP DEFAULT CURRENT_TIMESTAMP
    );
    
    CREATE TABLE user_verification (
        id INT PRIMARY KEY AUTO_INCREMENT,
        user_id INT NOT NULL,
        verification_code VARCHAR(10) NOT NULL,
        verified BOOLEAN DEFAULT FALSE,
        created_at TIMESTAMP DEFAULT CURRENT_TIMESTAMP,
        FOREIGN KEY (user_id) REFERENCES user_registration(id)
    );
    
    CREATE TABLE reward_points (
        id INT PRIMARY KEY AUTO_INCREMENT,
        user_id INT NOT NULL,
        points INT NOT NULL DEFAULT 0,
        created_at TIMESTAMP DEFAULT CURRENT_TIMESTAMP,
        FOREIGN KEY (user_id) REFERENCES user_registration(id)
    );
