INSERT INTO books (name) VALUES 
('Bond Portfolio A'), 
('Bond Portfolio B');

INSERT INTO counterparties (name) VALUES 
('Counterparty X'),
('Counterparty Y');
INSERT INTO securities (isin, cusip, issuer_name, maturity_date, coupon, type, face_value, currency, status) VALUES 
('US1234567890', '123456789', 'Issuer A', '2025-06-30', 5.5, 'Corporate Bond', 1000, 'USD', 'Active'),
('US0987654321', '987654321', 'Issuer B', '2025-12-15', 4.3, 'Government Bond', 5000, 'USD', 'Active');

INSERT INTO trades (book_id, security_id, counterparty_id, currency, status, quantity, unit_price, buy_sell_indicator, trade_date, settlement_date) VALUES 
(1, 1, 1, 'USD', 'OPEN', 100, 99.5, 'BUY', '2025-01-01', '2025-02-25'),
(2, 2, 2, 'USD', 'OPEN', 200, 102.3, 'SELL', '2025-01-10', '2025-03-15');
