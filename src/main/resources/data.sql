-- Categories
INSERT INTO Category (categoryId, categoryDesc) VALUES
(1, 'Hardware'),
(2, 'Software'),
(3, 'Access Management');

-- Subcategories
INSERT INTO Subcategory (subCategoryId, categoryId, subCategoryDesc) VALUES
(1, 1, 'Allocate Laptop'),
(2, 1, 'Allocate Hardware'),
(3, 1, 'Hardware replacement'),
(4, 2, 'Software Installation'),
(5, 2, 'Antivirus'),
(6, 2, 'Email Password update'),
(7, 2, 'Laptop Slowness issue'),
(8, 2, 'Software Issue'),
(9, 3, 'Software access'),
(10, 3, 'Wifi Access'),
(11, 3, 'Database Access'),
(12, 3, 'VPN Access');

-- Statuses
INSERT INTO Status (statusId, status) VALUES
(1, 'Open'),
(2, 'Assigned'),
(3, 'In Progress'),
(4, 'Completed');

-- Priorities
INSERT INTO Priority (priorityId, priority) VALUES
(1, 'Low'),
(2, 'Medium'),
(3, 'High'),
(4, 'Critical');