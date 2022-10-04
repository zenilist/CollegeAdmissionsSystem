# **370 Project Group 1**
## **Part A**
## **Team Members**
1. Aviraj Kar
1. Muhammad Umair Jamil
1. Omar Abdullah
1. Suraj Gurung 
1. Ankita KC 
1. Jurgen Dashi
1. Shiao Chen 
## **Purpose:**
After researching and completing some student surveys throughout our college my team and I have come to the conclusion of creating a software that can solve problems and complexities faced by all students throughout CUNY colleges.   

## **Overview:**
Design and develop a school administration project which simplifies the complex and confusing process a student takes when applying to Universities regarding admissions requirements and documentation.
## **Part B**

**1.5  Business Drivers/ Business Models: What is the incentive for this effort?**



The main goal of our project is to decrease the number of times a student has to contact college admissions and decrease the wait time. As per our surveys, 90% of students have trouble with the admissions process, and it's difficult for them to understand the process. Our project focuses on making the admissions process quick and effortless. Students will know beforehand if they are eligible for college and financial aid. Recent studies show that many students often do not apply because the college can not support online applications. This can help many colleges increase the amount of applicants and help decrease the time it takes to complete the tedious admissions process. Lastly, our model predicts that it can increase the revenue by having more students apply online. 

**1.6 Scope: Specify what the project will do and will not do**

The school admissions software design and develop a school administration project which simplifies the complex and confusing process a student takes when applying to Universities regarding admissions requirements and documentation.

Do:

1. Apply online
1. Keep track of data on the database
1. Faster application process
1. You get a notification once you have been accepted


Donts:

1. The school requirements that change every year need to be edited manually each time it changes
1. You cannot re-apply to the same university


**1.7 Definitions and/or Acronyms: Define something from business logic**

**I.) Application -** A questionnaire the user (in our case the student) fills out requiring them to answer a series of questions as well as refer to & provide documents if needed. As opposed to a form which has to be done in one go, an application can save progress and make it easier for users to keep track of and update the required information/documentation. Ex. Job applications,  College applications, etc. 

**II.) User Portal** - A specially designed website that brings information from diverse sources, like emails, online forums and search engines, together in a uniform way. The college admissions portal is the same because we have applications to multiple colleges and many steps throughout the process (admissions, document requirements, financial aid & such) that’s done through one application/website. 


**2.1 Use Case**

**Actor –  CUNY, universities, and college students** 

**Stakeholder- City University of New York**

**Primary Actor- University or College**

**Preconditions – the students already signed up for a college account in our login page. The students must also have their required documents.**

**Triggers – The students logging in and submitting in their required documents in the User Portal**

**Main success scenarios [Basic Flow] –** Applicants are successfully enrolled and accepted into their desired university

**Alternative paths [Alternative Flow] –** 

**1.** Reach out to a student advisor and seek out help for your issue/problem. 

**2.** Submit in your required documents in person to the university you are applying for

**3.** Navigate to the University's website in the How To section to see the steps involved in solving your specific error.  

**Postcondition After all the tasks are completed and documentations have been submitted and reviewed the student is accepted into their desired university.**


**2.2 Acceptance Criteria: Will be used to determine when the project is done, Include a bunch of values which are either pass or fail.**

1: All the documentation and eligibility is accepted (Submitted Documents should pass)

2: Have all documents submitted for completion.

\3. Eligibility requirements concerning documentation:

IN state: Age 17-65, Gpa >= 3.1, SAT >=  1100

Out State: Age 17-35, Gpa >= 3.4, SAT >= 1250

International: Age: 17-25, GPA >= 3.6, SAT >= 1320

Applicants would need to pass every criteria to proceed

4: The letters of acceptance into the University have been submitted via email to the eligible students. Eligibility should pass.

5: All payment should be done by the user through financial aid. Bursars’ payment = $7,000 if no financial aid or scholarship is received.

6: Meeting above requirements will accept the user as student in the college (Accepted into University = True)




**2.2 Assumptions vs Constraints**

***Assumptions:***

**Resources:**

\1.  All the materials and equipment needed will be obtained and available to be used when conducting the project.

\2.  All the resources allocated are sufficient for the project life-cycle. All required documentation have been provided to us by the school admissions office along with the schools financial aid office.

\3.       Members of the project team would have access to the tools they need to execute their respective tasks on schedule, including advanced equipment and software, and electricity during work time.

**Delivery/Methodology:**

\1.       The project will be finished within 3 months by 7 group members implementing different design patterns.

\2.       The architecture and design approach will be implemented differently by each team member. By using the methodology illustrated by the flowchart each team member implemented different design patterns for each section shown in the flowchart.

***Constraints:***

**Budget/Finances:**

\1.       We had a limited budget for all materials and equipment needed which was provided by CUNY.



**2.4 Assumptions vs Constraints**

- On Windows: Supports Chrome version 103 and above. Ideally you should have around 2 Gigs of free RAM to avoid a potential slowdown.
- On Mac: Supports Safari version 14 and above. For the best user experience, you should have at least 5 GB of idle RAM.
- Android: For ease of usage, it is recommended to have version 7 or higher. The phone must have at least 1GB of RAM and a GPU of Adreno 506 or a similar alternative.
- iOS: For ease of usage, it is recommended to have version 10 and above. Ideally browning experience on iPhone 6 and higher.
## **Part C**

**2.5 Context Diagrams and Process Flow Diagrams**
## ![](Aspose.Words.33403258-ba2c-4040-804b-c426cfc01509.001.png)
## **Part D, E, F Explained**
## **Design Patterns :** 
- Strategy Pattern 
- Singleton Pattern 
- Observer Pattern 
- Factory Pattern 
- Adaptor Pattern
- Memento Pattern 
- Command Pattern

## **Dividing the Project:** 
1. Combining all the parts
   1. Aviraj Kar
1. Logging in 
   1. **Umair Jamil** 
      1. **Command Pattern**

- Check to see if login details match. 
- If data is incorrect, return to login page to sign up 
- If data in correct, proceed to documentation process
1. Documentation (Required document (Y/N QNA) No need to for real docs) - Ask for the required documents 
   1. **Ankita**
      1. **Adapter Pattern**
1. Eligibility (Prove that documents exist Y/N, Forms, check to see if data matched range)
   1. **Aviraj Kar**
      1. **Factory Pattern**
   1. **Omar**
      1. **Observer Pattern** 

1. Financial Aid
   1. **Jurgen Dashi** (Y/N QNA for Transaction , Forms(QNA) for card details )
      1. **Singleton Pattern**  
         1. Scholarships 
         1. Fafsa process
1. Bursar 
   1. **Sihao Chen** 
      1. **Memento Pattern**	
         1. If any payments done / due 
         1. Look for grants 
1. Major Declaration
   1. **Suraj Gurung**
      1. **Strategy Pattern**
         1. Interests 
         1. Subjects 
         1. Major and Minor 

