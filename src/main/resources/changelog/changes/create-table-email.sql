CREATE TABLE email (
id BIGSERIAL PRIMARY KEY,
address TEXT NOT NULL,
type TEXT,
user_id BIGINT REFERENCES a_user(id)
)