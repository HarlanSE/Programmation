def funcao(string, posicao):
    
    string_cod = ""
    
    for c in range(len(string)):
        
        if ord(string[c]) != 32:
            
            if ord(string[c]) + posicao> 90:
                string_cod += chr((ord(string[c]) + posicao) - 26)
                
            else:
                string_cod += chr(ord(string[c]) + posicao)
        else:
            string_cod += " "
            
    return string_cod