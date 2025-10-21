CRUD-Farmacia (Java)
Descrição

Projeto de API CRUD em Java que gerencia os dados de uma farmácia.
Serve como demonstração de habilidades em back-end, manipulação de banco de dados e arquitetura de API REST.

Funcionalidades

Listar todos os medicamentos

Buscar medicamento por ID

Adicionar novo medicamento

Atualizar medicamento existente

Remover medicamento

Tecnologias Utilizadas

Java (Spring Boot)

MySQL ou outro banco relacional

Maven para gerenciamento de dependências

Postman ou outro cliente HTTP para testes

Modelo de Dados
| Campo      | Tipo       | Descrição                |
| ---------- | ---------- | ------------------------ |
| id         | Long       | Identificador único      |
| nome       | String     | Nome do medicamento      |
| descricao  | String     | Descrição do medicamento |
| preco      | BigDecimal | Preço do medicamento     |
| quantidade | Integer    | Quantidade em estoque    |

Rotas da API
| Método | Rota               | Descrição                         |
| ------ | ------------------ | --------------------------------- |
| GET    | /medicamentos      | Lista todos os medicamentos       |
| GET    | /medicamentos/{id} | Retorna um medicamento específico |
| POST   | /medicamentos      | Adiciona um novo medicamento      |
| PUT    | /medicamentos/{id} | Atualiza um medicamento existente |
| DELETE | /medicamentos/{id} | Remove um medicamento             |

Como Usar:
Clone o repositório:
git clone https://github.com/seu-usuario/CRUD-Farmacia.git

Configure o banco de dados no arquivo application.properties.

Execute o projeto no Spring Boot.

Teste as rotas usando Postman, Insomnia ou outro cliente HTTP.

Sugestões de Melhoria:

Adicionar validações e tratamento de erros para rotas.

Criar documentação Swagger para facilitar testes e integração.

Adicionar autenticação e autorização para segurança.

