package code;

import java.util.List;

abstract class Stmt {
    static class Block extends Stmt {
        Block(List<Stmt> statements) {
            this.statements = statements;
        }

        final List<Stmt> statements;
    }
    static class Expression extends Stmt {
        Expression(Expr expression) {
            this.expression = expression;
        }

        final Expr expression;
    }
    static class If extends Stmt {
        If(Expr condition, Stmt thenBranch, Stmt elseBranch) {
            this.condition = condition;
            this.thenBranch = thenBranch;
            this.elseBranch = elseBranch;
        }

        final Expr condition;
        final Stmt thenBranch;
        final Stmt elseBranch;
    }
    static class Print extends Stmt {
        Print(Expr expression) {
            this.expression = expression;
        }

        final Expr expression;
    }

    static class Scan extends Stmt {
        Scan(List<Token> variables) {
            this.variables = variables;
        }

        final List<Token> variables;
    }

    static class Var extends Stmt {
        Var(Token name, Expr initializer, TokenType type) {
            this.name = name;
            this.initializer = initializer;
            this.type = type;
        }

        final Token name;
        final Expr initializer;
        final TokenType type;
    }
    static class While extends Stmt {
        While(Expr condition, Stmt body) {
            this.condition = condition;
            this.body = body;
        }

        final Expr condition;
        final Stmt body;
    }
}
