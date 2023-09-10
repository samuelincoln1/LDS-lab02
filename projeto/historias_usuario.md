# História de Usuário 1: Cadastro de Cliente

Como um usuário individual (cliente), quero me cadastrar no sistema, para que eu possa introduzir, modificar, consultar e cancelar pedidos de aluguel.

Critérios de Aceitação:

- O sistema deve permitir que o cliente preencha seus dados de identificação (RG, CPF, Nome, Endereço).
- O cliente deve ser capaz de fornecer informações sobre sua profissão.
- O sistema deve permitir que o cliente informe até três entidades empregadoras e seus respectivos rendimentos auferidos.

# História de Usuário 2: Introduzir Pedido de Aluguel

Como um cliente cadastrado, quero ser capaz de introduzir um pedido de aluguel de um automóvel, para que eu possa alugar um veículo quando necessário.

## Critérios de Aceitação:

- O cliente deve ser capaz de selecionar o tipo de contrato desejado (propriedade do cliente, empresa ou banco).
- O cliente deve informar a matrícula, ano, marca, modelo e placa do veículo desejado.
- O sistema deve registrar o pedido de aluguel no sistema para análise financeira.

# História de Usuário 3: Análise de Pedido por Agente

Como um agente (empresa ou banco), quero ser capaz de analisar os pedidos de aluguel dos clientes, para que eu possa avaliar sua viabilidade financeira.

## Critérios de Aceitação:

- Os agentes devem ser capazes de visualizar os pedidos de aluguel pendentes.
- O sistema deve calcular e exibir informações financeiras relevantes para a avaliação do pedido.
- Os agentes podem aprovar ou recusar um pedido com base em critérios financeiros.

# História de Usuário 4: Modificar Pedido de Aluguel

Como um agente (empresa ou banco) autorizado, quero ser capaz de modificar um pedido de aluguel existente, para que eu possa ajustar os detalhes do contrato conforme necessário.

## Critérios de Aceitação:
- Os agentes devem ser capazes de pesquisar e localizar pedidos de aluguel existentes com base em informações como o número do pedido, cliente ou veículo.
- Após localizar o pedido de aluguel desejado, os agentes devem poder realizar as seguintes ações de modificação:

1. Alterar o veículo selecionado no pedido.
2. Atualizar os termos do contrato, como duração, quilometragem permitida e taxa.
3. Adicionar ou remover itens adicionais, como seguro adicional ou serviços extras.
4. Modificar a data de início ou término do contrato, se necessário.

# História de Usuário 5: Gestão de Pedidos e Contratos

Como um administrador do sistema, quero ser capaz de gerenciar todos os pedidos e contratos, para que eu possa garantir o funcionamento adequado do sistema.

## Critérios de Aceitação:

- O sistema deve fornecer uma interface de administração para visualizar, modificar e gerenciar todos os pedidos e contratos.
- Os administradores devem poder realizar ações de manutenção e solucionar problemas, se necessário.
- Estas histórias de usuário representam algumas das principais funcionalidades e interações do sistema. Elas podem ser refinadas e expandidas com mais detalhes e critérios de aceitação conforme necessário.

# História de Usuário 6: Modificar Pedido de Aluguel

Como um cliente registrado, quero ser capaz de modificar um pedido de aluguel existente, para que eu possa ajustar os detalhes do contrato de aluguel conforme necessário.

## Critérios de Aceitação:

- Os clientes devem ter a capacidade de visualizar uma lista de seus pedidos de aluguel existentes.

- Após selecionar um pedido de aluguel específico, os clientes devem poder realizar as seguintes ações de modificação:

1. Alterar o veículo selecionado no pedido.
2. Atualizar os termos do contrato, como duração, quilometragem permitida e taxa.
3. Adicionar ou remover itens adicionais, como seguro adicional ou serviços extras.
4. Modificar a data de início ou término do contrato, se necessário.
Após as modificações, o sistema deve recalcular automaticamente qualquer informação financeira relevante, como o valor do aluguel mensal.

- Os clientes devem receber uma confirmação das modificações realizadas.

# História de Usuário 7: Consultar Pedido de Aluguel

Como um cliente registrado, quero ser capaz de consultar os detalhes de um pedido de aluguel existente, para que eu possa revisar as informações do contrato quando necessário.

## Critérios de Aceitação:

- Os clientes devem ter a capacidade de visualizar uma lista de seus pedidos de aluguel existentes.

- Após selecionar um pedido de aluguel específico, os clientes devem poder visualizar todos os detalhes do contrato, incluindo o veículo, os termos do contrato, itens adicionais e informações financeiras.

# História de Usuário 8: Cancelar Pedido de Aluguel

Como um cliente registrado, quero ser capaz de cancelar um pedido de aluguel existente, para que eu possa desistir do contrato de aluguel.

## Critérios de Aceitação:

- Os clientes devem ter a capacidade de visualizar uma lista de seus pedidos de aluguel existentes.

- Após selecionar um pedido de aluguel específico, os clientes devem poder cancelar o pedido de aluguel.

- O sistema deve solicitar uma confirmação final antes de concluir o cancelamento.

- Após o cancelamento, o sistema deve gerar uma confirmação do cancelamento e encerrar o contrato de aluguel adequadamente, se aplicável.