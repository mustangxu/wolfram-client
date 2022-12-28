/**
 * Authored by jayxu @2022
 */
package com.jayxu.wolfram;

import java.util.List;
import java.util.function.Function;

import lombok.Data;

/**
 * <pre>
 * {
    "queryresult": {
        "success": true,
        "error": false,
        "numpods": 8,
        "datatypes": "",
        "timedout": "MathematicalFunctionData,Recognize",
        "timedoutpods": "",
        "timing": 3.6950000000000003,
        "parsetiming": 0.13,
        "parsetimedout": false,
        "recalculate": "https://www6b3.wolframalpha.com/api/v1/recalc.jsp?id=MSPa198011g4c5gic968891g00005431h9723491gfh86430556393126808734&output=JSON",
        "id": "MSP198111g4c5gic968891g00001h29082a029ad2b6",
        "host": "https://www6b3.wolframalpha.com",
        "server": "4",
        "related": "https://www6b3.wolframalpha.com/api/v1/relatedQueries.jsp?id=MSPa198211g4c5gic968891g00001g7geeh890g5i5c26430556393126808734",
        "version": "2.6",
        "inputstring": "fibonacci(200)",
        "pods": [
            {
                "title": "Input",
                "scanner": "Identity",
                "id": "Input",
                "position": 100,
                "error": false,
                "numsubpods": 1,
                "subpods": [
                    {
                        "title": "",
                        "img": {
                            "src": "https://www6b3.wolframalpha.com/Calculate/MSP/MSP198311g4c5gic968891g00002h9a4b6e2d69c155?MSPStoreType=image/gif&s=4",
                            "alt": "F_200",
                            "title": "F_200",
                            "width": 28,
                            "height": 19,
                            "type": "Default",
                            "themes": "1,2,3,4,5,6,7,8,9,10,11,12",
                            "colorinvertable": true,
                            "contenttype": "image/gif"
                        },
                        "plaintext": "F_200"
                    }
                ],
                "expressiontypes": {
                    "name": "Default"
                },
                "infos": {
                    "text": "F_n is the nth Fibonacci number",
                    "img": {
                        "src": "https://www6b3.wolframalpha.com/Calculate/MSP/MSP198411g4c5gic968891g000049hgca5ah7970ch3?MSPStoreType=image/gif&s=4",
                        "alt": "F_n is the nth Fibonacci number",
                        "title": "F_n is the nth Fibonacci number",
                        "width": "200",
                        "height": "22"
                    },
                    "links": [
                        {
                            "url": "http://reference.wolfram.com/language/ref/Fibonacci.html",
                            "text": "Documentation",
                            "title": "Mathematica"
                        },
                        {
                            "url": "http://functions.wolfram.com/IntegerFunctions/Fibonacci",
                            "text": "Properties",
                            "title": "Wolfram Functions Site"
                        },
                        {
                            "url": "http://mathworld.wolfram.com/FibonacciNumber.html",
                            "text": "Definition",
                            "title": "MathWorld"
                        }
                    ]
                }
            },
            {
                "title": "Result",
                "scanner": "Identity",
                "id": "Result",
                "position": 200,
                "error": false,
                "numsubpods": 1,
                "primary": true,
                "subpods": [
                    {
                        "title": "",
                        "primary": true,
                        "img": {
                            "src": "https://www6b3.wolframalpha.com/Calculate/MSP/MSP198511g4c5gic968891g00004b92aec63c552145?MSPStoreType=image/gif&s=4",
                            "alt": "280571172992510140037611932413038677189525",
                            "title": "280571172992510140037611932413038677189525",
                            "width": 364,
                            "height": 19,
                            "type": "Default",
                            "themes": "1,2,3,4,5,6,7,8,9,10,11,12",
                            "colorinvertable": true,
                            "contenttype": "image/gif"
                        },
                        "plaintext": "280571172992510140037611932413038677189525"
                    }
                ],
                "expressiontypes": {
                    "name": "Default"
                }
            },
            {
                "title": "Scientific notation",
                "scanner": "Numeric",
                "id": "DecimalApproximation",
                "position": 300,
                "error": false,
                "numsubpods": 1,
                "primary": true,
                "subpods": [
                    {
                        "title": "",
                        "img": {
                            "src": "https://www6b3.wolframalpha.com/Calculate/MSP/MSP198611g4c5gic968891g000055d7d1f1dfg68i6c?MSPStoreType=image/gif&s=4",
                            "alt": "2.80571172992510140037611932413038677189525 × 10^41",
                            "title": "2.80571172992510140037611932413038677189525 × 10^41",
                            "width": 397,
                            "height": 22,
                            "type": "Default",
                            "themes": "1,2,3,4,5,6,7,8,9,10,11,12",
                            "colorinvertable": true,
                            "contenttype": "image/gif"
                        },
                        "plaintext": "2.80571172992510140037611932413038677189525 × 10^41"
                    }
                ],
                "expressiontypes": {
                    "name": "Default"
                }
            },
            {
                "title": "Number name",
                "scanner": "Integer",
                "id": "NumberName",
                "position": 400,
                "error": false,
                "numsubpods": 1,
                "subpods": [
                    {
                        "title": "",
                        "img": {
                            "src": "https://www6b3.wolframalpha.com/Calculate/MSP/MSP198711g4c5gic968891g000037i2ac4g1eg961d4?MSPStoreType=image/gif&s=4",
                            "alt": "280 duodecillion ...",
                            "title": "280 duodecillion ...",
                            "width": 125,
                            "height": 19,
                            "type": "Default",
                            "themes": "1,2,3,4,5,6,7,8,9,10,11,12",
                            "colorinvertable": true,
                            "contenttype": "image/gif"
                        },
                        "plaintext": "280 duodecillion ..."
                    }
                ],
                "expressiontypes": {
                    "name": "Default"
                },
                "states": [
                    {
                        "name": "Full name",
                        "input": "NumberName__Full name"
                    }
                ]
            },
            {
                "title": "Number length",
                "scanner": "Integer",
                "id": "NumberLength",
                "position": 500,
                "error": false,
                "numsubpods": 1,
                "subpods": [
                    {
                        "title": "",
                        "img": {
                            "src": "https://www6b3.wolframalpha.com/Calculate/MSP/MSP198811g4c5gic968891g00004i93d655g5a8563a?MSPStoreType=image/gif&s=4",
                            "alt": "42 decimal digits",
                            "title": "42 decimal digits",
                            "width": 110,
                            "height": 19,
                            "type": "Default",
                            "themes": "1,2,3,4,5,6,7,8,9,10,11,12",
                            "colorinvertable": true,
                            "contenttype": "image/gif"
                        },
                        "plaintext": "42 decimal digits"
                    }
                ],
                "expressiontypes": {
                    "name": "Default"
                }
            },
            {
                "title": "Alternative representations",
                "scanner": "MathematicalFunctionData",
                "id": "AlternativeRepresentations:MathematicalFunctionIdentityData",
                "position": 600,
                "error": false,
                "numsubpods": 3,
                "subpods": [
                    {
                        "title": "",
                        "img": {
                            "src": "https://www6b3.wolframalpha.com/Calculate/MSP/MSP198911g4c5gic968891g000050224f6cih5708g1?MSPStoreType=image/gif&s=4",
                            "alt": "F_200 = (L_199 + L_201)/5",
                            "title": "F_200 = (L_199 + L_201)/5",
                            "width": 123,
                            "height": 45,
                            "type": "Default",
                            "themes": "1,2,3,4,5,6,7,8,9,10,11,12",
                            "colorinvertable": true,
                            "contenttype": "image/gif"
                        },
                        "plaintext": "F_200 = (L_199 + L_201)/5"
                    },
                    {
                        "title": "",
                        "img": {
                            "src": "https://www6b3.wolframalpha.com/Calculate/MSP/MSP199011g4c5gic968891g000027e47277hg4099ei?MSPStoreType=image/gif&s=4",
                            "alt": "F_200 = fibonacci(200, 1)",
                            "title": "F_200 = fibonacci(200, 1)",
                            "width": 94,
                            "height": 29,
                            "type": "Default",
                            "themes": "1,2,3,4,5,6,7,8,9,10,11,12",
                            "colorinvertable": true,
                            "contenttype": "image/gif"
                        },
                        "plaintext": "F_200 = fibonacci(200, 1)"
                    },
                    {
                        "title": "",
                        "img": {
                            "src": "https://www6b3.wolframalpha.com/Calculate/MSP/MSP199111g4c5gic968891g00005164b6h6h659d4c0?MSPStoreType=image/gif&s=4",
                            "alt": "F_200 = U_199(-i/2) i^199",
                            "title": "F_200 = U_199(-i/2) i^199",
                            "width": 140,
                            "height": 45,
                            "type": "Default",
                            "themes": "1,2,3,4,5,6,7,8,9,10,11,12",
                            "colorinvertable": true,
                            "contenttype": "image/gif"
                        },
                        "plaintext": "F_200 = U_199(-i/2) i^199"
                    }
                ],
                "expressiontypes": [
                    {
                        "name": "Default"
                    },
                    {
                        "name": "Default"
                    },
                    {
                        "name": "Default"
                    }
                ],
                "states": [
                    {
                        "name": "More",
                        "input": "AlternativeRepresentations:MathematicalFunctionIdentityData__More"
                    }
                ],
                "infos": [
                    {
                        "text": "L_n is the nth Lucas number",
                        "img": {
                            "src": "https://www6b3.wolframalpha.com/Calculate/MSP/MSP199211g4c5gic968891g000049b511ge1ha22db0?MSPStoreType=image/gif&s=4",
                            "alt": "L_n is the nth Lucas number",
                            "title": "L_n is the nth Lucas number",
                            "width": "174",
                            "height": "22"
                        },
                        "links": [
                            {
                                "url": "http://reference.wolfram.com/language/ref/LucasL.html",
                                "text": "Documentation",
                                "title": "Mathematica"
                            },
                            {
                                "url": "http://mathworld.wolfram.com/LucasNumber.html",
                                "text": "Definition",
                                "title": "MathWorld"
                            }
                        ]
                    },
                    {
                        "text": "fibonacci(n, x) is the Fibonacci polynomial",
                        "img": {
                            "src": "https://www6b3.wolframalpha.com/Calculate/MSP/MSP199311g4c5gic968891g000046hddc8i6ha8254a?MSPStoreType=image/gif&s=4",
                            "alt": "fibonacci(n, x) is the Fibonacci polynomial",
                            "title": "fibonacci(n, x) is the Fibonacci polynomial",
                            "width": "217",
                            "height": "19"
                        },
                        "links": [
                            {
                                "url": "http://reference.wolfram.com/language/ref/Fibonacci.html",
                                "text": "Documentation",
                                "title": "Mathematica"
                            },
                            {
                                "url": "http://functions.wolfram.com/Polynomials/Fibonacci2",
                                "text": "Properties",
                                "title": "Wolfram Functions Site"
                            },
                            {
                                "url": "http://mathworld.wolfram.com/FibonacciPolynomial.html",
                                "text": "Definition",
                                "title": "MathWorld"
                            }
                        ]
                    },
                    {
                        "text": "U_n(x) is the Chebyshev polynomial of the second kind",
                        "img": {
                            "src": "https://www6b3.wolframalpha.com/Calculate/MSP/MSP199411g4c5gic968891g0000106g3af5f47i2hbc?MSPStoreType=image/gif&s=4",
                            "alt": "U_n(x) is the Chebyshev polynomial of the second kind",
                            "title": "U_n(x) is the Chebyshev polynomial of the second kind",
                            "width": "347",
                            "height": "19"
                        },
                        "links": [
                            {
                                "url": "http://reference.wolfram.com/language/ref/ChebyshevU.html",
                                "text": "Documentation",
                                "title": "Mathematica"
                            },
                            {
                                "url": "http://functions.wolfram.com/Polynomials/ChebyshevU",
                                "text": "Properties",
                                "title": "Wolfram Functions Site"
                            },
                            {
                                "url": "http://mathworld.wolfram.com/ChebyshevPolynomialoftheSecondKind.html",
                                "text": "Definition",
                                "title": "MathWorld"
                            }
                        ]
                    },
                    {
                        "text": "i is the imaginary unit",
                        "img": {
                            "src": "https://www6b3.wolframalpha.com/Calculate/MSP/MSP199511g4c5gic968891g00000e07da4eg095914b?MSPStoreType=image/gif&s=4",
                            "alt": "i is the imaginary unit",
                            "title": "i is the imaginary unit",
                            "width": "146",
                            "height": "19"
                        },
                        "links": [
                            {
                                "url": "http://reference.wolfram.com/language/ref/I.html",
                                "text": "Documentation",
                                "title": "Documentation"
                            },
                            {
                                "url": "http://mathworld.wolfram.com/i.html",
                                "text": "Definition",
                                "title": "MathWorld"
                            }
                        ]
                    },
                    {
                        "links": {
                            "url": "http://functions.wolfram.com/IntegerFunctions/Fibonacci/27/ShowAll.html",
                            "text": "More information"
                        }
                    }
                ]
            },
            {
                "title": "Integral representation",
                "scanner": "MathematicalFunctionData",
                "id": "IntegralRepresentations:MathematicalFunctionIdentityData",
                "position": 700,
                "error": false,
                "numsubpods": 1,
                "subpods": [
                    {
                        "title": "",
                        "img": {
                            "src": "https://www6b3.wolframalpha.com/Calculate/MSP/MSP199611g4c5gic968891g00004g343478i35aiheg?MSPStoreType=image/gif&s=4",
                            "alt": "F_200 = 4294812672766761091970509414713510605850896016675/316912650057057350374175801344 integral_0^π sin(t) (1 + 1/3 cos(t) sqrt(5))^99 dt",
                            "title": "F_200 = 4294812672766761091970509414713510605850896016675/316912650057057350374175801344 integral_0^π sin(t) (1 + 1/3 cos(t) sqrt(5))^99 dt",
                            "width": 483,
                            "height": 84,
                            "type": "Default",
                            "themes": "1,2,3,4,5,6,7,8,9,10,11,12",
                            "colorinvertable": true,
                            "contenttype": "image/gif"
                        },
                        "plaintext": "F_200 = 4294812672766761091970509414713510605850896016675/316912650057057350374175801344 integral_0^π sin(t) (1 + 1/3 cos(t) sqrt(5))^99 dt"
                    }
                ],
                "expressiontypes": {
                    "name": "Default"
                },
                "infos": {
                    "links": {
                        "url": "http://functions.wolfram.com/IntegerFunctions/Fibonacci/07/ShowAll.html",
                        "text": "More information"
                    }
                }
            },
            {
                "title": "Multiple-argument formulas",
                "scanner": "MathematicalFunctionData",
                "id": "MultipleArgumentFormulas:MathematicalFunctionIdentityData",
                "position": 800,
                "error": false,
                "numsubpods": 3,
                "subpods": [
                    {
                        "title": "",
                        "img": {
                            "src": "https://www6b3.wolframalpha.com/Calculate/MSP/MSP199711g4c5gic968891g00002gdcagc83221icbc?MSPStoreType=image/gif&s=4",
                            "alt": "F_200 = F_100 L_100",
                            "title": "F_200 = F_100 L_100",
                            "width": 106,
                            "height": 29,
                            "type": "Default",
                            "themes": "1,2,3,4,5,6,7,8,9,10,11,12",
                            "colorinvertable": true,
                            "contenttype": "image/gif"
                        },
                        "plaintext": "F_200 = F_100 L_100"
                    },
                    {
                        "title": "",
                        "img": {
                            "src": "https://www6b3.wolframalpha.com/Calculate/MSP/MSP199811g4c5gic968891g00005d7aei29dc6b8bg6?MSPStoreType=image/gif&s=4",
                            "alt": "F_200 = -F_196 + 3 F_198",
                            "title": "F_200 = -F_196 + 3 F_198",
                            "width": 142,
                            "height": 29,
                            "type": "Default",
                            "themes": "1,2,3,4,5,6,7,8,9,10,11,12",
                            "colorinvertable": true,
                            "contenttype": "image/gif"
                        },
                        "plaintext": "F_200 = -F_196 + 3 F_198"
                    },
                    {
                        "title": "",
                        "img": {
                            "src": "https://www6b3.wolframalpha.com/Calculate/MSP/MSP199911g4c5gic968891g000041b461fdf909119i?MSPStoreType=image/gif&s=4",
                            "alt": "F_200 = sum_(k=0)^100 binomial(100, k) F_k",
                            "title": "F_200 = sum_(k=0)^100 binomial(100, k) F_k",
                            "width": 130,
                            "height": 61,
                            "type": "Default",
                            "themes": "1,2,3,4,5,6,7,8,9,10,11,12",
                            "colorinvertable": true,
                            "contenttype": "image/gif"
                        },
                        "plaintext": "F_200 = sum_(k=0)^100 binomial(100, k) F_k"
                    }
                ],
                "expressiontypes": [
                    {
                        "name": "Default"
                    },
                    {
                        "name": "Default"
                    },
                    {
                        "name": "Default"
                    }
                ],
                "states": [
                    {
                        "name": "More",
                        "input": "MultipleArgumentFormulas:MathematicalFunctionIdentityData__More"
                    }
                ],
                "infos": [
                    {
                        "text": "binomial(n, m) is the binomial coefficient",
                        "img": {
                            "src": "https://www6b3.wolframalpha.com/Calculate/MSP/MSP200011g4c5gic968891g000036578111hgdbf9e9?MSPStoreType=image/gif&s=4",
                            "alt": "binomial(n, m) is the binomial coefficient",
                            "title": "binomial(n, m) is the binomial coefficient",
                            "width": "202",
                            "height": "38"
                        },
                        "links": [
                            {
                                "url": "http://reference.wolfram.com/language/ref/Binomial.html",
                                "text": "Documentation",
                                "title": "Mathematica"
                            },
                            {
                                "url": "http://functions.wolfram.com/GammaBetaErf/Binomial",
                                "text": "Properties",
                                "title": "Wolfram Functions Site"
                            },
                            {
                                "url": "http://mathworld.wolfram.com/BinomialCoefficient.html",
                                "text": "Definition",
                                "title": "MathWorld"
                            }
                        ]
                    },
                    {
                        "links": {
                            "url": "http://functions.wolfram.com/IntegerFunctions/Fibonacci/16/ShowAll.html",
                            "text": "More information"
                        }
                    }
                ]
            }
        ],
        "assumptions": [
            {
                "type": "Clash",
                "word": "fibonacci",
                "template": "Assuming \"${word}\" is ${desc1}. Use as ${desc2} instead",
                "count": 2,
                "values": [
                    {
                        "name": "Function",
                        "desc": "a math function",
                        "input": "*C.fibonacci-_*Function-"
                    },
                    {
                        "name": "NumberSetTypeWord",
                        "desc": " referring to a type of number",
                        "input": "*C.fibonacci-_*NumberSetTypeWord-"
                    }
                ]
            },
            {
                "type": "MultiClash",
                "word": "",
                "template": "Assuming ${word1} is referring to ${desc1}. Use \"${word2}\" as ${desc2}.",
                "count": 2,
                "values": [
                    {
                        "name": "MathOperator",
                        "word": "(",
                        "desc": " referring to math",
                        "input": "*MC.%28200%29-_*MathOperator-"
                    },
                    {
                        "name": "NumberMathParentheses",
                        "word": "(200)",
                        "desc": " referring to math",
                        "input": "*MC.%28200%29-_*NumberMathParentheses-"
                    }
                ]
            }
        ]
    }
}
 * </pre>
 *
 * @author xujiajing
 */
@Data
public class WolframResponse {
    private QueryResult queryresult;

    @Data
    public static class QueryResult {
        boolean success;
        boolean error;
        Integer numpods;
        String datatypes;
        String timedout;
        String timedoutpods;
        Double timing;
        Double parsetiming;
        Boolean parsetimedout;
        String recalculate;
        String id;
        String host;
        String server;
        String related;
        String version;
        String inputstring;
        List<Pod> pods;
    }

    @Data
    public static class Pod {
        String title;
        String scanner;
        String id;
        Integer position;
        boolean error;
        Integer numsubpods;
        boolean primary;
        Img img;
        String plaintext;
        List<Pod> subpods;
        // issue
        // Info infos;
    }

    @Data
    public static class Img {
        String src;
        String alt;
        String title;
        Integer width;
        Integer height;
        String type;
        String themes;
        Boolean colorinvertable;
        String contenttype;
    }

    @Data
    public static class Info {
        String text;
        Img img;
        List<Link> links;
    }

    @Data
    public static class Link {
        String url;
        String text;
        String title;
    }

    public <T> T extractPrimaryResult(Function<String, T> mapper) {
        return this.getQueryresult().getPods().stream().filter(Pod::isPrimary)
            .findFirst().map(Pod::getSubpods).get().stream().findFirst()
            .map(Pod::getPlaintext).map(mapper).get();
    }

    public String extractPrimaryResult() {
        return this.extractPrimaryResult(o -> o);
    }
}
