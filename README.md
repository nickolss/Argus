## Argus
<p align="center">
  <img src="./docs/Logo.png" alt="Logo" width="200"/>
</p>

### 🎯 O que é e para que serve?
O Argus é um sistema back-end que coleta, armazena, analisa e gera alertas com base em registros (logs) de atividades em diferentes sistemas. Esses logs podem vir de servidores, APIs, dispositivos IoT, firewalls, ou qualquer outro dispositivo que gere eventos de segurança.

### 🔎 Como seria utilizado na prática?
#### 1 - Cenário 1: Detecção de Ataques Brute Force

Um atacante tenta adivinhar a senha de um usuário fazendo várias tentativas de login. O sistema:

- Coleta os registros de tentativas de login do servidor.
- Analisa os padrões (ex: muitos erros de senha em um curto período).
- Gera um alerta para o Analista de Segurança sobre a tentativa de brute force.
- Opcionalmente, bloqueia o IP do atacante por um tempo.

#### 2 - Cenário 2: Monitoramento de Acessos Suspeitos

Um usuário acessa o sistema de um país diferente em horários incomuns. O sistema:

- Registra o horário, IP e localização geográfica.
- Compara com o histórico do usuário.
- Se for uma anomalia, emite um alerta para revisão.

#### 3 - Cenário 3: Conformidade e Auditoria
A empresa precisa provar que está em conformidade com as normas de segurança. O sistema:

- Coleta e armazena todos os eventos importantes (logins, alterações em dados críticos).
- Gera relatórios detalhados mostrando quem fez o quê e quando.
- Armazena os logs por um período específico, conforme exigências de conformidade.



### 🎯 Funcionalidades:
1 - Coleta de Logs:

- Captura de logs via API REST ou importação de arquivos.
- Suporte a diferentes formatos (JSON, CSV, Syslog).

2 - Armazenamento Seguro:

- Banco de dados com criptografia para armazenar os logs.
- Organização por data, origem e tipo de evento.


3 - Análise de Logs:

- Identificação de padrões suspeitos (ex: tentativas de login falhas, escaneamento de portas).
- Detecção de anomalias com algoritmos básicos de Machine Learning (como Isolation Forest ou DBSCAN).

4 - Alertas de Segurança:

- Geração de alertas quando atividades suspeitas são detectadas.
- Integração com sistemas de notificações (e-mail, Discord, Slack).


5 - Relatórios de Auditoria:

- Geração de relatórios detalhados sobre eventos críticos.
- Exportação em PDF ou CSV.

6 - Autenticação e Autorização:

- Autenticação JWT para API.
- Controle de acesso baseado em papéis (Admin, Analista, Auditor).

### ⚙️ Como funciona por trás dos panos?

1 - Coleta de Logs:

- As aplicações ou dispositivos enviam logs para a API do sistema via requisições HTTP (ex: POST /logs).
- Também é possível importar arquivos de log (JSON ou CSV).

2 - Armazenamento Seguro:

- Os logs são armazenados em um banco de dados NoSQL (ex: MongoDB) para fácil indexação e consulta.
- Cada log é criptografado usando AES para garantir a confidencialidade.

3 - Análise e Detecção:

- Algoritmos de Machine Learning analisam os padrões de comportamento.
- Regras de segurança (ex: falhas consecutivas de login) são usadas para identificar ameaças conhecidas.

4 - Alertas e Notificações:

- Quando uma ameaça é7 detectada, o sistema envia alertas por e-mail, Slack ou Discord.
- Os alertas incluem detalhes como IP de origem, usuário afetado, horário do evento, etc.

5 - Relatórios e Auditorias:

- Relatórios podem ser gerados periodicamente (ex: semanal, mensal).
- Incluem resumo de eventos críticos, tentativas de ataque, acessos incomuns, etc.

### 💻 Tecnologias Sugeridas:
- Banco de Dados: PostgreSQL.
- Segurança: Criptografia AES para armazenamento de logs, autenticação com JWT.
- Machine Learning: Utilizando bibliotecas como Weka ou Scikit-learn para detecção de anomalias.
- Docker: Para facilitar o deploy e a escalabilidade.