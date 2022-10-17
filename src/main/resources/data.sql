CREATE EXTENSION IF NOT EXISTS "uuid-ossp";

INSERT INTO players (id, first_name, last_name, birthday)
    VALUES (uuid_generate_v1(), 'Lionel', 'Messi','1987-05-24');

INSERT INTO players (id, first_name, last_name, birthday)
    VALUES (uuid_generate_v1(), 'Cristiano', 'Ronaldo','1985-02-05');