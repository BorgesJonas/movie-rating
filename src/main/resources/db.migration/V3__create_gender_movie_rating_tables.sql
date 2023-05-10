CREATE TABLE gender(
	id INT AUTO_INCREMENT PRIMARY KEY,
    name VARCHAR(50) NOT NULL
);

CREATE TABLE movie(
	id INT AUTO_INCREMENT PRIMARY KEY,
    image VARCHAR(500)  NOT NULL,
    title VARCHAR(255)  NOT NULL,
    synopsis VARCHAR(2000)  NOT NULL,
    release_year DATETIME  NOT NULL,
    gender_id INT  NOT NULL,
    total_rate FLOAT,
    FOREIGN KEY (gender_id) REFERENCES gender(id)
);

CREATE TABLE rating(
	id INT AUTO_INCREMENT PRIMARY KEY,
    user_id INT NOT NULL,
    movie_id INT NOT NULL,
    rate FLOAT NOT NULL,
    FOREIGN KEY (user_id) REFERENCES user(id),
    FOREIGN KEY (movie_id) REFERENCES movie(id)
);