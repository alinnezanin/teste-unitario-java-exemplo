# 🧮 Projeto: Calculadora de Desconto com Testes Unitários

Este é um projeto simples em Java que demonstra a importância de **testes unitários** usando **JUnit 5**. A aplicação calcula o valor de desconto com base no valor da compra, e os testes validam o comportamento esperado para diferentes faixas de valor.

## 📌 Objetivo

Ensinar de forma prática:
- Como estruturar uma lógica simples de negócio
- Como escrever testes unitários com JUnit 5
- Como garantir que mudanças futuras não quebrem a regra de negócio (regressão)

## 💡 Regras de Negócio

| Valor da compra         | Desconto aplicado |
|-------------------------|--------------------|
| Até R$ 100              | R$ 0               |
| De R$ 100,01 a R$ 500   | 5%                 |
| Acima de R$ 500         | 10%                |

---

## 🛠️ Tecnologias

- Java 17 (ou 11)
- Maven
- JUnit 5

---

## 🚀 Como executar

1. Clone o repositório:
   ```bash
   git clone https://github.com/seu-usuario/desconto.git
   cd desconto
