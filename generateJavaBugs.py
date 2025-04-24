import os


with open("Complex.java", "r") as file:
    base_code = file.read()


modifications = [
    lambda code: code.replace(";", ":"),   
    lambda code: code.replace("(", "["),             
    lambda code: code.replace(".", ","),                     
    lambda code: code.replace("System", "Sytem"),            
    lambda code: code.replace("{", "["),                  
    lambda code: code.replace(")", "))"),               
    lambda code: code.replace("int", "integer"),  
    lambda code: code.replace("0", "O"), 
    lambda code: code.replace("m", "n"),                          
    lambda code: code.replace(" ", "b")  
]


os.makedirs("SeniorProject", exist_ok=True)

for i, mod in enumerate(modifications):
    class_name = f"ComplexBug{i+1}"
 
    modified_code = base_code.replace("Complex", class_name)
   
    buggy_code = mod(modified_code)
    with open(f"SeniorProject/{class_name}.java", "w") as f:
        f.write(buggy_code)