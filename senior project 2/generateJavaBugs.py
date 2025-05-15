import os
import random

def replace_n_random(code, old, new, n=3):
    indices = [i for i in range(len(code)) if code.startswith(old, i)]
    if not indices:
        return code  # no occurrences at all
    
    to_replace = set(random.sample(indices, min(n, len(indices))))
    
    result = []
    i = 0
    old_len = len(old)
    
    while i < len(code):
        if i in to_replace:
            result.append(new)
            i += old_len
        else:
            result.append(code[i])
            i += 1
    
    return ''.join(result)


with open("Complex.java", "r") as file:
    base_code = file.read()


modifications = [
     lambda code: replace_n_random(code, ";", ":"),                             # 1
    lambda code: replace_n_random(code, "(", "["),                             # 2
    lambda code: replace_n_random(code, ".", ","),                             # 3
    lambda code: replace_n_random(code, "System", "Sytem"),                    # 4
    lambda code: replace_n_random(code, "{", "["),                             # 5
    lambda code: replace_n_random(code, ")", "))"),                            # 6
    lambda code: replace_n_random(code, "int", "integer"),                     # 7
    lambda code: replace_n_random(code, "0", "O"),                             # 8
    lambda code: replace_n_random(code, "m", "n"),                             # 9
    lambda code: replace_n_random(code, " ", "b"),                             # 10
    lambda code: replace_n_random(code, ";", ""),                              # 11
    lambda code: replace_n_random(code, "int", "Int"),                         # 12
    lambda code: replace_n_random(code, "this", "thsi"),                       # 13
    lambda code: replace_n_random(code, "public", "publc"),                    # 14
    lambda code: replace_n_random(code, "class", "clas"),                      # 15
    lambda code: replace_n_random(code, "return", ""),                         # 16
    lambda code: replace_n_random(code, "new", "nw"),                          # 17
    lambda code: replace_n_random(code, "System.out.println", "System.ou.println"),  # 18
    lambda code: replace_n_random(code, "(", "{"),                             # 19
    lambda code: replace_n_random(code, ")", "]"),                             # 20
    lambda code: replace_n_random(code, ";", ":"),                             # 21
    lambda code: replace_n_random(code, "{", "}"),                             # 22
    lambda code: replace_n_random(code, "}", "]"),                             # 23
    lambda code: replace_n_random(code, "=", "=="),                            # 24
    lambda code: replace_n_random(code, "-", "_"),                             # 26
    lambda code: replace_n_random(code, "Complex", "Complx"),                  # 27
    lambda code: replace_n_random(code, "void", "viod"),                       # 28
    lambda code: replace_n_random(code, "static", "statc"),                    # 29
    lambda code: replace_n_random(code, "main", "man"),                        # 30
    lambda code: replace_n_random(code, "args", "arg"),                        # 31
    lambda code: replace_n_random(code, "int x", "integer x"),                # 32
    lambda code: replace_n_random(code, "int y", "integer y"),                # 33
    lambda code: replace_n_random(code, "sum", "summ"),                        # 34
    lambda code: replace_n_random(code, "The difference is", "The diffrence is"),  # 35
    lambda code: replace_n_random(code, "add", "ad"),                          # 36
    lambda code: replace_n_random(code, "subtract", "substract"),             # 37
    lambda code: replace_n_random(code, "real", "rel"),                        # 38
    lambda code: replace_n_random(code, "imaginary", "fake"),                 # 39
    lambda code: replace_n_random(code, "c1", "C1"),                           # 40
    lambda code: replace_n_random(code, "c2", "c#"),                           # 41
    lambda code: replace_n_random(code, "Complex", "complicated"),            # 42
    lambda code: replace_n_random(code, "diff", "difff"),                     # 43
    lambda code: replace_n_random(code, "()", ")("),                # 44
    lambda code: replace_n_random(code, "main(String[]args)", "man(String arg)"),  # 45
    lambda code: replace_n_random(code, "}", ""),                              # 46
    lambda code: replace_n_random(code, "{", ""),                              # 47
    lambda code: replace_n_random(code, " ", ""),                              # 48
    lambda code: replace_n_random(code, ",", "."),                             # 49
    lambda code: replace_n_random(code, " ", "mcvn"),                            # 50
]


os.makedirs("bugFiles", exist_ok=True)

for i, mod in enumerate(modifications):
    class_name = f"ComplexBug{i+1}"
 
    modified_code = base_code.replace("Complex", class_name)
   
    buggy_code = mod(modified_code)
    with open(f"bugFiles/{class_name}.java", "w") as f:
        f.write(buggy_code)