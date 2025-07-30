-- 1683. Invalid Tweets

-- Solution

SELECT tweet_id FROM Tweets WHERE LENGTH(content) > '15'