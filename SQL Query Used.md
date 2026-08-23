# SQL Queries Used

## PostgreSQL Connection
```bash
/opt/homebrew/opt/postgresql@17/bin/psql -d postDB
```

## List Tables
```sql
\dt
```

## Check Posts Table
```sql
SELECT * FROM posts;
```

## Check Post Likes Table
```sql
SELECT * FROM post_like;
```

## Create Posts Table (manual)
```sql
CREATE TABLE posts (
    id BIGSERIAL PRIMARY KEY,
    content VARCHAR(255) NOT NULL,
    user_id BIGINT NOT NULL,
    created_at TIMESTAMP NOT NULL DEFAULT CURRENT_TIMESTAMP
);
```

## Create Post Likes Table (manual)
```sql
CREATE TABLE post_like (
    id BIGSERIAL PRIMARY KEY,
    user_id BIGINT NOT NULL,
    post_id BIGINT NOT NULL,
    created_at TIMESTAMP NOT NULL DEFAULT CURRENT_TIMESTAMP
);
```