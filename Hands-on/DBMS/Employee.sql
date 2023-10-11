/*Create the Employee Table*/
CREATE TABLE Employee (
    EmployeeID INT PRIMARY KEY,
    FirstName VARCHAR(50),
    LastName VARCHAR(50),
    DateOfBirth DATE,
    Email VARCHAR(100),
    PhoneNumber VARCHAR(15),
    DepartmentID INT,
    ManagerID INT,
    FOREIGN KEY (DepartmentID) REFERENCES Department(DepartmentID),
    FOREIGN KEY (ManagerID) REFERENCES Employee(EmployeeID)
);

-- Create the Department Table
CREATE TABLE Department (
    DepartmentID INT PRIMARY KEY,
    DepartmentName VARCHAR(50),
    Location VARCHAR(100)
);

-- Create the EmployeeRole Table
CREATE TABLE EmployeeRole (
    RoleID INT PRIMARY KEY,
    RoleName VARCHAR(50)
);

-- Create the EmployeeDepartment Table (Many-to-Many)
CREATE TABLE EmployeeDepartment (
    EmployeeID INT,
    DepartmentID INT,
    FOREIGN KEY (EmployeeID) REFERENCES Employee(EmployeeID),
    FOREIGN KEY (DepartmentID) REFERENCES Department(DepartmentID)
);

-- Create the EmployeeRoleAssignment Table (Many-to-Many)
CREATE TABLE EmployeeRoleAssignment (
    EmployeeID INT,
    RoleID INT,
    StartDate DATE,
    EndDate DATE,
    FOREIGN KEY (EmployeeID) REFERENCES Employee(EmployeeID),
    FOREIGN KEY (RoleID) REFERENCES EmployeeRole(RoleID)
);

-- Create the Salary Table
CREATE TABLE Salary (
    SalaryID INT PRIMARY KEY,
    EmployeeID INT,
    SalaryAmount DECIMAL(10, 2),
    StartDate DATE,
    EndDate DATE,
    FOREIGN KEY (EmployeeID) REFERENCES Employee(EmployeeID)
);
