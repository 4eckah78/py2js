import sys
from antlr4 import *
from py2jsLexer import py2jsLexer
from py2jsParser import py2jsParser
from py2jsVisitor import *


# class Visitor(py2jsVisitor):
#     pass
    


def main(argv):
    # input_stream = FileStream(argv[1])
    py_code = FileStream("./pyprogram.py")
    # py_code = InputStream('Bob says "hello" \n Alice says "hi"')
    lexer = py2jsLexer(py_code)
    stream = CommonTokenStream(lexer)
    parser = py2jsParser(stream)
    tree = parser.file_input()
    visitor = py2jsVisitor()
    print(tree.toStringTree(parser.ruleNames))
    js_code = visitor.visit(tree)
    with open("jsprogram.js", "w") as f:
        f.write(js_code)
    
    # htmlChat = py2jsListener(output)
    # walker = ParseTreeWalker()
    # walker.walk(htmlChat, tree)
        
    # output.close()     
 
if __name__ == '__main__':
    main(sys.argv)


    
