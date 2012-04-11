create table api_call_log (
  id bigint generated by default as identity (start with 1),
  log_timestamp timestamp default null,
  user_id varchar(1000) default null,
  spentity_id varchar(1000) default null,
  ip_address varchar(1000) default null,
  api_version varchar(1000) default null,
  resource_url varchar(1000) default null,
  consumer_key varchar(1024) default null,
  primary key (id)
);

INSERT INTO api_call_log (user_id, spentity_id, ip_address, api_version, resource_url, consumer_key)
VALUES
  ('test_user', 'testsp1', '127.0.0.1', 'shindig', 'http://localhost/test/person', 'consumer_key');
  
INSERT INTO api_call_log (user_id, spentity_id, ip_address, api_version, resource_url, consumer_key)
VALUES
  ('test_user', 'testsp1', '127.0.0.1', 'shindig', 'http://localhost/test/person', 'consumer_key');
  
INSERT INTO api_call_log (user_id, spentity_id, ip_address, api_version, resource_url, consumer_key)
VALUES
  ('test_user', 'testsp2', '127.0.0.1', 'shindig', 'http://localhost/test/person', 'consumer_key');  
