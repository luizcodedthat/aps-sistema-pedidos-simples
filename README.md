# 🛒 Sistema de Pedidos - Loja Virtual (Terminal Java)

## 📦 Estrutura do Projeto

```
src/
├── Main.java
├── model/
│   ├── Cliente.java
│   ├── Produto.java
│   ├── Pedido.java
│   └── ItemPedido.java
├── servico/
│   ├── FreteCalculadoraPeso.java
│   ├── FreteCalculadoraDistancia.java
│   ├── NotificadorEmail.java
│   ├── NotificadorSMS.java
│   └── NotificadorWhatsApp.java
├── relatorio/
    ├── RelatorioTexto.java
    └── RelatorioJSON.java

```

## ▶️ Como Executar
1. Compile todos os arquivos:
   ```bash
   javac src/**/*.java src/*.java
   ```

2. Execute o programa:
   ```bash
   java -cp src Main
   ```

---

## 👤 Responsabilidades no Projeto

### Luiz
- 🧱 **Modelos principais**  
  `Cliente.java`, `Produto.java`, `ItemPedido.java`, `Pedido.java`
- 🧪 **Criação de instâncias, menu e lógica de fluxo**  
  `Main.java`, `Entrada.java`
- 🔁 **Lógica de cadastro e criação de pedidos**  
  Menus: cadastrar clientes, produtos, criar pedidos, escolher frete e notificação
- 🧾 **Integração com notificações e frete**  
  Integra as classes de Lucas no momento da confirmação do pedido

### Lucas
- 🚚 **Serviços de frete**  
  `FreteCalculadoraPeso.java`, `FreteCalculadoraDistancia.java`
- 🔔 **Simulação de notificações**  
  `NotificadorEmail.java`, `NotificadorSMS.java`, `NotificadorWhatsApp.java`
- 📄 **Geração de relatórios**  
  `RelatorioTexto.java`, `RelatorioJSON.java`
- 🧪 **Testes dos serviços e relatórios**  
  Criação de dados mock para validar notificações e relatórios separadamente

### Ambos
- 💬 **Integração final do menu**  
  Teste conjunto do fluxo completo do sistema
- 📝 **README.md (dividido)**  
  Luiz: estrutura e execução  
  Lucas: funcionalidades e plano de refatoração

---

## ✅ Funcionalidades

- Cadastro de clientes com nome, CPF, email e telefone.
- Cadastro de produtos com nome, preço e peso.
- Criação de pedidos vinculados a clientes.
  - Adição de múltiplos produtos por pedido.
  - Cálculo do valor total dos itens.
- Cálculo de frete:
  - Por peso total (R$ 5,00/kg).
  - Por distância (R$ 0,50/km informado).
- Simulação de envio de notificações por:
  - E-mail
  - SMS
  - WhatsApp
- Geração de relatórios:
  - Em texto (exibido no terminal).
  - Em formato JSON (string simulada no terminal, sem uso de bibliotecas).

---

## ⚠️ Desafios e Pontos de Refatoração

### Desafios:
- Lidar com listas dinâmicas de pedidos e produtos sem uso de banco de dados.
- Separar responsabilidade entre pacotes.

### O que falta / será refatorado futuramente:
- Uso de padrões de projeto (Strategy, Factory, etc.).
- Persistência de dados em arquivos ou banco de dados.
- Implementação real de notificações (integração com APIs).
- Interface gráfica ou web no futuro.
- Validações de entrada mais robustas (ex: CPF, email, etc.).

---

## 👥 Autores
- **Luiz** – Estrutura do projeto, execução e lógica de menu
- **Lucas** – Funcionalidades de frete, notificação, relatórios e análise final
