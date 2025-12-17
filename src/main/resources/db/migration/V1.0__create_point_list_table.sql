CREATE TABLE point_list (
    id BIGINT PRIMARY KEY AUTO_INCREMENT,
    device_id VARCHAR(255) NOT NULL,
    point_id VARCHAR(255) NOT NULL,
    topic VARCHAR(255) NOT NULL,
    created_time DATETIME NOT NULL DEFAULT CURRENT_TIMESTAMP,
    INDEX idx_device_id (device_id),
    INDEX idx_point_id (point_id),
    INDEX idx_created_time (created_time)
);