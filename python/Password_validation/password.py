
keyboard_symbols = [
    "`", "~",
    "!", "@", "#", "$", "%", "^", "&", "*", "(", ")",
    "-", "_", "=", "+",
    "[", "]", "{", "}",
    "\\", "|",
    ";", ":", "'", '"',
    ",", ".", "<", ">", "/", "?"," "
]

def seperator(intake):

    return [word for word in intake]

def check_uppercase(num,latest,results):
    if results[num].isalpha():
        value_uppercase = results[num].upper()
        if value_uppercase == results[num]:
            latest[0]=1
    return  latest

def check_lower(num,latest,results):
    if results[num].isalpha():
        value_lower = results[num].lower()
        if value_lower == results[num]:
            latest[1]=1
    return latest

def check_symbols(num,latest,results):
    for symbol in keyboard_symbols:
        if symbol == results[num]:
            latest[2]=1
    return latest

def check_number(num,latest,results):
    if results[num].isnumeric():
        number=results[num]
        if number.isdigit():
            latest[3]=1
    return latest

def check_length(latest,results):
    if len(results) >= 10:
        latest[4]=1
    return latest







