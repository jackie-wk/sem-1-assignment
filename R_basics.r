#basics of R programming
my_mat <- list(
  "add" = 2+3,
  "sub" = 5-2,
  "mult" = 4*3,
  "div" = 20/5,
  "exp" = 2*3,
  "mod" = 10%%3,
  "round" = round(3.14325, 2),
  "seq" = seq(1,10, by =2),
  "sqrt" = sqrt(16),
  "assign" = x <- 7,

  "floor_div" = 10%/%3
)
print(my_mat)

#generate 100 random no from normal distribution
random_no <- rnorm(100, mean = 0, sd = 1)
print(random_no)
#plot histogram of random no
hist(random_no, main = "Histogram of Random Numbers", xlab = "Value", ylab = "Frequency", col = "blue") # nolint
plot(random_no, main = "Scatter Plot of Random Numbers", xlab = "Index", ylab = "Value", col = "red") 
#lineplot
plot(random_no, type = "l", main = "Line Plot of Random Numbers", xlab = "Index", ylab = "Value", col = "green") # nolint

x <- c(0:10, 500) #assign to x the values from 0 to 10 and 500
xm = mean(x) #calculate mean of x
print(x)
print(xm)


var_x <- var(x) #calculate the variance of x
print(var_x)
sd_x <- sd(x) #calculates the standard deviation of x
print(sd_x)
sqrt(var_x) == sd_x  #check if the square root of variance equals standard deviation
 if (sqrt((var_x)) == sd_x) {
    print("The square root of variance equals standard deviation.")
 } else {

        print("The squareroot of variance is not equal to standard deviation")
    }


#vector using concatenate(c) funct
my_vector <- c(1,2,3,4,5)
print(my_vector)
#vector using sequence(seq) funct
my_vector2 <- seq(1,10, by =2)
print(my_vector2)

#matrix using matrix() finct
my_matrix <- matrix(1:9, nrow = 3, ncol =3)
print(my_matrix)

m1 <- matrix(1:6, nrow =2, byrow =TRUE) #create a matrix with 2 rows and 3 columns, filling it by row
print(m1)

my_list <- list(
    "name" = "Jackie",
    "age" = 30,
    "is_student" = TRUE,
    "adm_no" = "st01/50297/2024"
)
print(my_list)

my_list2 <- list(a = 1:3,
           b = c("apple", "banana", "cherry"), # nolint: indentation_linter.
                  kids = c("Jackie", "John", "Jane"))
my_list2$a
my_list2$kids
str(my_list2) #structure of the list

myarray <- as.array(1:12, dim = c(2,3,2))  #create a 3D array with dimensions 2x3x2
print(myarray)

my_array <- array(1:24, dim = c(2,3,4)) #create a 3D array with dimensions 2x3x4
print(my_array)

my_arrray2 <- str(array(1:10, dim = 30)) #create a 3D array with dimensions 2x3x4 and print its structure
print(my_arrray2)

my_array3 <- array(1:3, c(2,6)) #create a 2D array by recycling the value(1,2,)
print(my_array3)

y <- c("Tom","Kim","Harriet", "John", "Mary") #character
print(typeof(y))
z <- c(TRUE, FALSE, TRUE, TRUE, FALSE)
print(typeof(z))
xx <- c(1.2, "Nairobi")
print(typeof(xx))
xxx <- c(TRUE, 1.2, "Kigali")
print(typeof(xxx))
print(length(xxx)) #vector length
print(nchar(xxx)) #number of characters


#dataset from hypothetical survey for 15 individuals
#gender
gender <- sample(c("Male", "Female"), 15, replace = TRUE) 
#age
age <- sample(0:10, 15, replace = TRUE) 

#weight numeric vector with 15 values from 25 -80)kgs
weight <- sample(25:80, 15, replace = TRUE) 

#marital_status
marital_status <- sample(c("Single", "Married", "Divorced"), 15, replace = TRUE) 

#income
income <- sample(0:10000, 15, replace = TRUE)

#combine all vectors into a data frame
survey_data <- data.frame(gender, age, weight, marital_status, income)
print(survey_data)

#summary of the dataset
print(summary(survey_data) )

#libraries in R
#installing ggplot2 package for data visualization
#install.packages("ggplot2")
library(ggplot2)
#installing dplyr package for data manipulation
#install.packages("dplyr")
library(dplyr)

#use ggplot to create a scatter plot of age against incom

  plot(survey_data$age, survey_data$income, 
       main = "Scatter Plot of Age vs Income", 
       xlab = "Age", ylab = "Income", col = "blue")

#use dplyr to filter the dataset for individuals with income greater than 5000
high_income <- survey_data %>% filter(income > 5000)
print(high_income)





