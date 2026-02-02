import pandas as pd 

data_frame = pd.read_csv("https://raw.githubusercontent.com/guilhermeonrails/data-jobs/refs/heads/main/salaries.csv")

print('----------head----------\n')
print(data_frame.head()) 

print('\n ----------info----------\n')
print(data_frame.info())

print(' \n---------describe----------\n')
print(data_frame.describe())

print('\n----------shape----------\n')
linhas, colunas = data_frame.shape[0], data_frame.shape[1]

print(f'qtdd linhas: {linhas} qtdd colunas: {colunas}') 


