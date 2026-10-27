package com.alibaba.fastjson;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Volumes/前任肥胖/下载/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_8_sz9482380.dex */
public class JSONPath implements com.alibaba.fastjson.JSONAware {
    private static int CACHE_SIZE = 1024;
    private static java.util.concurrent.ConcurrentMap<java.lang.String, com.alibaba.fastjson.JSONPath> pathCache;
    private com.alibaba.fastjson.parser.ParserConfig parserConfig;
    private final java.lang.String path;
    private com.alibaba.fastjson.JSONPath.Segement[] segments;
    private com.alibaba.fastjson.serializer.SerializeConfig serializeConfig;

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    static class ArrayAccessSegement implements com.alibaba.fastjson.JSONPath.Segement {
        private final int index;

        public ArrayAccessSegement(int r1) {
                r0 = this;
                r0.<init>()
                r0.index = r1
                return
        }

        @Override // com.alibaba.fastjson.JSONPath.Segement
        public java.lang.Object eval(com.alibaba.fastjson.JSONPath r1, java.lang.Object r2, java.lang.Object r3) {
                r0 = this;
                int r2 = r0.index
                java.lang.Object r1 = r1.getArrayItem(r3, r2)
                return r1
        }

        public boolean remove(com.alibaba.fastjson.JSONPath r2, java.lang.Object r3) {
                r1 = this;
                int r0 = r1.index
                boolean r2 = r2.removeArrayItem(r2, r3, r0)
                return r2
        }

        public boolean setValue(com.alibaba.fastjson.JSONPath r2, java.lang.Object r3, java.lang.Object r4) {
                r1 = this;
                int r0 = r1.index
                boolean r2 = r2.setArrayItem(r2, r3, r0, r4)
                return r2
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    static class DoubleOpSegement implements com.alibaba.fastjson.JSONPath.Filter {
        private final com.alibaba.fastjson.JSONPath.Operator op;
        private final java.lang.String propertyName;
        private final double value;

        public DoubleOpSegement(java.lang.String r1, double r2, com.alibaba.fastjson.JSONPath.Operator r4) {
                r0 = this;
                r0.<init>()
                r0.propertyName = r1
                r0.value = r2
                r0.op = r4
                return
        }

        @Override // com.alibaba.fastjson.JSONPath.Filter
        public boolean apply(com.alibaba.fastjson.JSONPath r5, java.lang.Object r6, java.lang.Object r7, java.lang.Object r8) {
                r4 = this;
                java.lang.String r6 = r4.propertyName
                r7 = 0
                java.lang.Object r5 = r5.getPropertyValue(r8, r6, r7)
                if (r5 != 0) goto La
                return r7
            La:
                boolean r6 = r5 instanceof java.lang.Number
                if (r6 != 0) goto Lf
                return r7
            Lf:
                java.lang.Number r5 = (java.lang.Number) r5
                double r5 = r5.doubleValue()
                com.alibaba.fastjson.JSONPath$Operator r8 = r4.op
                com.alibaba.fastjson.JSONPath$Operator r0 = com.alibaba.fastjson.JSONPath.Operator.EQ
                r1 = 1
                if (r8 != r0) goto L24
                double r2 = r4.value
                int r8 = (r5 > r2 ? 1 : (r5 == r2 ? 0 : -1))
                if (r8 != 0) goto L23
                return r1
            L23:
                return r7
            L24:
                com.alibaba.fastjson.JSONPath$Operator r0 = com.alibaba.fastjson.JSONPath.Operator.NE
                if (r8 != r0) goto L30
                double r2 = r4.value
                int r8 = (r5 > r2 ? 1 : (r5 == r2 ? 0 : -1))
                if (r8 == 0) goto L2f
                return r1
            L2f:
                return r7
            L30:
                com.alibaba.fastjson.JSONPath$Operator r0 = com.alibaba.fastjson.JSONPath.Operator.GE
                if (r8 != r0) goto L3c
                double r2 = r4.value
                int r8 = (r5 > r2 ? 1 : (r5 == r2 ? 0 : -1))
                if (r8 < 0) goto L3b
                return r1
            L3b:
                return r7
            L3c:
                com.alibaba.fastjson.JSONPath$Operator r0 = com.alibaba.fastjson.JSONPath.Operator.GT
                if (r8 != r0) goto L48
                double r2 = r4.value
                int r8 = (r5 > r2 ? 1 : (r5 == r2 ? 0 : -1))
                if (r8 <= 0) goto L47
                return r1
            L47:
                return r7
            L48:
                com.alibaba.fastjson.JSONPath$Operator r0 = com.alibaba.fastjson.JSONPath.Operator.LE
                if (r8 != r0) goto L54
                double r2 = r4.value
                int r8 = (r5 > r2 ? 1 : (r5 == r2 ? 0 : -1))
                if (r8 > 0) goto L53
                return r1
            L53:
                return r7
            L54:
                com.alibaba.fastjson.JSONPath$Operator r0 = com.alibaba.fastjson.JSONPath.Operator.LT
                if (r8 != r0) goto L5f
                double r2 = r4.value
                int r8 = (r5 > r2 ? 1 : (r5 == r2 ? 0 : -1))
                if (r8 >= 0) goto L5f
                return r1
            L5f:
                return r7
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    interface Filter {
        boolean apply(com.alibaba.fastjson.JSONPath r1, java.lang.Object r2, java.lang.Object r3, java.lang.Object r4);
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    public static class FilterSegement implements com.alibaba.fastjson.JSONPath.Segement {
        private final com.alibaba.fastjson.JSONPath.Filter filter;

        public FilterSegement(com.alibaba.fastjson.JSONPath.Filter r1) {
                r0 = this;
                r0.<init>()
                r0.filter = r1
                return
        }

        @Override // com.alibaba.fastjson.JSONPath.Segement
        public java.lang.Object eval(com.alibaba.fastjson.JSONPath r5, java.lang.Object r6, java.lang.Object r7) {
                r4 = this;
                r0 = 0
                if (r7 != 0) goto L4
                return r0
            L4:
                com.alibaba.fastjson.JSONArray r1 = new com.alibaba.fastjson.JSONArray
                r1.<init>()
                boolean r2 = r7 instanceof java.lang.Iterable
                if (r2 == 0) goto L2b
                r0 = r7
                java.lang.Iterable r0 = (java.lang.Iterable) r0
                java.util.Iterator r0 = r0.iterator()
            L14:
                boolean r2 = r0.hasNext()
                if (r2 == 0) goto L2a
                java.lang.Object r2 = r0.next()
                com.alibaba.fastjson.JSONPath$Filter r3 = r4.filter
                boolean r3 = r3.apply(r5, r6, r7, r2)
                if (r3 == 0) goto L14
                r1.add(r2)
                goto L14
            L2a:
                return r1
            L2b:
                com.alibaba.fastjson.JSONPath$Filter r1 = r4.filter
                boolean r5 = r1.apply(r5, r6, r7, r7)
                if (r5 == 0) goto L34
                return r7
            L34:
                return r0
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    static class IntBetweenSegement implements com.alibaba.fastjson.JSONPath.Filter {
        private final long endValue;
        private final boolean not;
        private final java.lang.String propertyName;
        private final long startValue;

        public IntBetweenSegement(java.lang.String r1, long r2, long r4, boolean r6) {
                r0 = this;
                r0.<init>()
                r0.propertyName = r1
                r0.startValue = r2
                r0.endValue = r4
                r0.not = r6
                return
        }

        @Override // com.alibaba.fastjson.JSONPath.Filter
        public boolean apply(com.alibaba.fastjson.JSONPath r2, java.lang.Object r3, java.lang.Object r4, java.lang.Object r5) {
                r1 = this;
                java.lang.String r3 = r1.propertyName
                r4 = 0
                java.lang.Object r2 = r2.getPropertyValue(r5, r3, r4)
                if (r2 != 0) goto La
                return r4
            La:
                boolean r3 = r2 instanceof java.lang.Number
                if (r3 == 0) goto L25
                java.lang.Number r2 = (java.lang.Number) r2
                long r2 = r2.longValue()
                long r4 = r1.startValue
                int r0 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
                if (r0 < 0) goto L25
                long r4 = r1.endValue
                int r0 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
                if (r0 > 0) goto L25
                boolean r2 = r1.not
                r2 = r2 ^ 1
                return r2
            L25:
                boolean r2 = r1.not
                return r2
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    static class IntInSegement implements com.alibaba.fastjson.JSONPath.Filter {
        private final boolean not;
        private final java.lang.String propertyName;
        private final long[] values;

        public IntInSegement(java.lang.String r1, long[] r2, boolean r3) {
                r0 = this;
                r0.<init>()
                r0.propertyName = r1
                r0.values = r2
                r0.not = r3
                return
        }

        @Override // com.alibaba.fastjson.JSONPath.Filter
        public boolean apply(com.alibaba.fastjson.JSONPath r5, java.lang.Object r6, java.lang.Object r7, java.lang.Object r8) {
                r4 = this;
                java.lang.String r6 = r4.propertyName
                r7 = 0
                java.lang.Object r5 = r5.getPropertyValue(r8, r6, r7)
                if (r5 != 0) goto La
                return r7
            La:
                boolean r6 = r5 instanceof java.lang.Number
                if (r6 == 0) goto L27
                java.lang.Number r5 = (java.lang.Number) r5
                long r5 = r5.longValue()
                long[] r8 = r4.values
                int r0 = r8.length
            L17:
                if (r7 >= r0) goto L27
                r1 = r8[r7]
                int r3 = (r1 > r5 ? 1 : (r1 == r5 ? 0 : -1))
                if (r3 != 0) goto L24
                boolean r5 = r4.not
                r5 = r5 ^ 1
                return r5
            L24:
                int r7 = r7 + 1
                goto L17
            L27:
                boolean r5 = r4.not
                return r5
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    static class IntObjInSegement implements com.alibaba.fastjson.JSONPath.Filter {
        private final boolean not;
        private final java.lang.String propertyName;
        private final java.lang.Long[] values;

        public IntObjInSegement(java.lang.String r1, java.lang.Long[] r2, boolean r3) {
                r0 = this;
                r0.<init>()
                r0.propertyName = r1
                r0.values = r2
                r0.not = r3
                return
        }

        @Override // com.alibaba.fastjson.JSONPath.Filter
        public boolean apply(com.alibaba.fastjson.JSONPath r5, java.lang.Object r6, java.lang.Object r7, java.lang.Object r8) {
                r4 = this;
                java.lang.String r6 = r4.propertyName
                r7 = 0
                java.lang.Object r5 = r5.getPropertyValue(r8, r6, r7)
                if (r5 != 0) goto L1d
                java.lang.Long[] r5 = r4.values
                int r6 = r5.length
            Lc:
                if (r7 >= r6) goto L1a
                r8 = r5[r7]
                if (r8 != 0) goto L17
                boolean r5 = r4.not
            L14:
                r5 = r5 ^ 1
                return r5
            L17:
                int r7 = r7 + 1
                goto Lc
            L1a:
                boolean r5 = r4.not
                return r5
            L1d:
                boolean r6 = r5 instanceof java.lang.Number
                if (r6 == 0) goto L3f
                java.lang.Number r5 = (java.lang.Number) r5
                long r5 = r5.longValue()
                java.lang.Long[] r8 = r4.values
                int r0 = r8.length
            L2a:
                if (r7 >= r0) goto L3f
                r1 = r8[r7]
                if (r1 != 0) goto L31
                goto L3c
            L31:
                long r1 = r1.longValue()
                int r3 = (r1 > r5 ? 1 : (r1 == r5 ? 0 : -1))
                if (r3 != 0) goto L3c
                boolean r5 = r4.not
                goto L14
            L3c:
                int r7 = r7 + 1
                goto L2a
            L3f:
                boolean r5 = r4.not
                return r5
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    static class IntOpSegement implements com.alibaba.fastjson.JSONPath.Filter {
        private final com.alibaba.fastjson.JSONPath.Operator op;
        private final java.lang.String propertyName;
        private final long value;

        public IntOpSegement(java.lang.String r1, long r2, com.alibaba.fastjson.JSONPath.Operator r4) {
                r0 = this;
                r0.<init>()
                r0.propertyName = r1
                r0.value = r2
                r0.op = r4
                return
        }

        @Override // com.alibaba.fastjson.JSONPath.Filter
        public boolean apply(com.alibaba.fastjson.JSONPath r5, java.lang.Object r6, java.lang.Object r7, java.lang.Object r8) {
                r4 = this;
                java.lang.String r6 = r4.propertyName
                r7 = 0
                java.lang.Object r5 = r5.getPropertyValue(r8, r6, r7)
                if (r5 != 0) goto La
                return r7
            La:
                boolean r6 = r5 instanceof java.lang.Number
                if (r6 != 0) goto Lf
                return r7
            Lf:
                java.lang.Number r5 = (java.lang.Number) r5
                long r5 = r5.longValue()
                com.alibaba.fastjson.JSONPath$Operator r8 = r4.op
                com.alibaba.fastjson.JSONPath$Operator r0 = com.alibaba.fastjson.JSONPath.Operator.EQ
                r1 = 1
                if (r8 != r0) goto L24
                long r2 = r4.value
                int r8 = (r5 > r2 ? 1 : (r5 == r2 ? 0 : -1))
                if (r8 != 0) goto L23
                return r1
            L23:
                return r7
            L24:
                com.alibaba.fastjson.JSONPath$Operator r0 = com.alibaba.fastjson.JSONPath.Operator.NE
                if (r8 != r0) goto L30
                long r2 = r4.value
                int r8 = (r5 > r2 ? 1 : (r5 == r2 ? 0 : -1))
                if (r8 == 0) goto L2f
                return r1
            L2f:
                return r7
            L30:
                com.alibaba.fastjson.JSONPath$Operator r0 = com.alibaba.fastjson.JSONPath.Operator.GE
                if (r8 != r0) goto L3c
                long r2 = r4.value
                int r8 = (r5 > r2 ? 1 : (r5 == r2 ? 0 : -1))
                if (r8 < 0) goto L3b
                return r1
            L3b:
                return r7
            L3c:
                com.alibaba.fastjson.JSONPath$Operator r0 = com.alibaba.fastjson.JSONPath.Operator.GT
                if (r8 != r0) goto L48
                long r2 = r4.value
                int r8 = (r5 > r2 ? 1 : (r5 == r2 ? 0 : -1))
                if (r8 <= 0) goto L47
                return r1
            L47:
                return r7
            L48:
                com.alibaba.fastjson.JSONPath$Operator r0 = com.alibaba.fastjson.JSONPath.Operator.LE
                if (r8 != r0) goto L54
                long r2 = r4.value
                int r8 = (r5 > r2 ? 1 : (r5 == r2 ? 0 : -1))
                if (r8 > 0) goto L53
                return r1
            L53:
                return r7
            L54:
                com.alibaba.fastjson.JSONPath$Operator r0 = com.alibaba.fastjson.JSONPath.Operator.LT
                if (r8 != r0) goto L5f
                long r2 = r4.value
                int r8 = (r5 > r2 ? 1 : (r5 == r2 ? 0 : -1))
                if (r8 >= 0) goto L5f
                return r1
            L5f:
                return r7
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    static class JSONPathParser {
        private char ch;
        private int level;
        private final java.lang.String path;
        private int pos;

        public JSONPathParser(java.lang.String r1) {
                r0 = this;
                r0.<init>()
                r0.path = r1
                r0.next()
                return
        }

        static boolean isDigitFirst(char r1) {
                r0 = 45
                if (r1 == r0) goto L13
                r0 = 43
                if (r1 == r0) goto L13
                r0 = 48
                if (r1 < r0) goto L11
                r0 = 57
                if (r1 > r0) goto L11
                goto L13
            L11:
                r1 = 0
                return r1
            L13:
                r1 = 1
                return r1
        }

        void accept(char r4) {
                r3 = this;
                char r0 = r3.ch
                if (r0 != r4) goto Le
                boolean r4 = r3.isEOF()
                if (r4 != 0) goto Ld
                r3.next()
            Ld:
                return
            Le:
                com.alibaba.fastjson.JSONPathException r0 = new com.alibaba.fastjson.JSONPathException
                java.lang.StringBuilder r1 = new java.lang.StringBuilder
                r1.<init>()
                java.lang.String r2 = "expect '"
                r1.append(r2)
                r1.append(r4)
                java.lang.String r4 = ", but '"
                r1.append(r4)
                char r4 = r3.ch
                r1.append(r4)
                java.lang.String r4 = "'"
                r1.append(r4)
                java.lang.String r4 = r1.toString()
                r0.<init>(r4)
                throw r0
        }

        com.alibaba.fastjson.JSONPath.Segement buildArraySegement(java.lang.String r11) {
                r10 = this;
                int r0 = r11.length()
                r1 = 0
                char r2 = r11.charAt(r1)
                r3 = 1
                int r0 = r0 - r3
                char r4 = r11.charAt(r0)
                r5 = 44
                int r5 = r11.indexOf(r5)
                int r6 = r11.length()
                java.lang.String r7 = ","
                r8 = -1
                r9 = 2
                if (r6 <= r9) goto L51
                r6 = 39
                if (r2 != r6) goto L51
                if (r4 != r6) goto L51
                if (r5 != r8) goto L31
                java.lang.String r11 = r11.substring(r3, r0)
                com.alibaba.fastjson.JSONPath$PropertySegement r0 = new com.alibaba.fastjson.JSONPath$PropertySegement
                r0.<init>(r11, r1)
                return r0
            L31:
                java.lang.String[] r11 = r11.split(r7)
                int r0 = r11.length
                java.lang.String[] r0 = new java.lang.String[r0]
            L38:
                int r2 = r11.length
                if (r1 >= r2) goto L4b
                r2 = r11[r1]
                int r4 = r2.length()
                int r4 = r4 - r3
                java.lang.String r2 = r2.substring(r3, r4)
                r0[r1] = r2
                int r1 = r1 + 1
                goto L38
            L4b:
                com.alibaba.fastjson.JSONPath$MultiPropertySegement r11 = new com.alibaba.fastjson.JSONPath$MultiPropertySegement
                r11.<init>(r0)
                return r11
            L51:
                r0 = 58
                int r0 = r11.indexOf(r0)
                if (r5 != r8) goto L77
                if (r0 != r8) goto L77
                boolean r0 = com.alibaba.fastjson.util.TypeUtils.isNumber(r11)
                if (r0 == 0) goto L71
                int r0 = java.lang.Integer.parseInt(r11)     // Catch: java.lang.NumberFormatException -> L6b
                com.alibaba.fastjson.JSONPath$ArrayAccessSegement r2 = new com.alibaba.fastjson.JSONPath$ArrayAccessSegement     // Catch: java.lang.NumberFormatException -> L6b
                r2.<init>(r0)     // Catch: java.lang.NumberFormatException -> L6b
                return r2
            L6b:
                com.alibaba.fastjson.JSONPath$PropertySegement r0 = new com.alibaba.fastjson.JSONPath$PropertySegement
                r0.<init>(r11, r1)
                return r0
            L71:
                com.alibaba.fastjson.JSONPath$PropertySegement r0 = new com.alibaba.fastjson.JSONPath$PropertySegement
                r0.<init>(r11, r1)
                return r0
            L77:
                if (r5 == r8) goto L94
                java.lang.String[] r11 = r11.split(r7)
                int r0 = r11.length
                int[] r0 = new int[r0]
            L80:
                int r2 = r11.length
                if (r1 >= r2) goto L8e
                r2 = r11[r1]
                int r2 = java.lang.Integer.parseInt(r2)
                r0[r1] = r2
                int r1 = r1 + 1
                goto L80
            L8e:
                com.alibaba.fastjson.JSONPath$MultiIndexSegement r11 = new com.alibaba.fastjson.JSONPath$MultiIndexSegement
                r11.<init>(r0)
                return r11
            L94:
                if (r0 == r8) goto L10d
                java.lang.String r0 = ":"
                java.lang.String[] r11 = r11.split(r0)
                int r0 = r11.length
                int[] r2 = new int[r0]
                r4 = 0
            La0:
                int r5 = r11.length
                if (r4 >= r5) goto Lbf
                r5 = r11[r4]
                int r6 = r5.length()
                if (r6 != 0) goto Lb6
                if (r4 != 0) goto Lb0
                r2[r4] = r1
                goto Lbc
            Lb0:
                java.lang.UnsupportedOperationException r11 = new java.lang.UnsupportedOperationException
                r11.<init>()
                throw r11
            Lb6:
                int r5 = java.lang.Integer.parseInt(r5)
                r2[r4] = r5
            Lbc:
                int r4 = r4 + 1
                goto La0
            Lbf:
                r11 = r2[r1]
                if (r0 <= r3) goto Lc5
                r8 = r2[r3]
            Lc5:
                r1 = 3
                if (r0 != r1) goto Lca
                r3 = r2[r9]
            Lca:
                if (r8 < 0) goto Lee
                if (r8 < r11) goto Lcf
                goto Lee
            Lcf:
                java.lang.UnsupportedOperationException r0 = new java.lang.UnsupportedOperationException
                java.lang.StringBuilder r1 = new java.lang.StringBuilder
                r1.<init>()
                java.lang.String r2 = "end must greater than or equals start. start "
                r1.append(r2)
                r1.append(r11)
                java.lang.String r11 = ",  end "
                r1.append(r11)
                r1.append(r8)
                java.lang.String r11 = r1.toString()
                r0.<init>(r11)
                throw r0
            Lee:
                if (r3 <= 0) goto Lf6
                com.alibaba.fastjson.JSONPath$RangeSegement r0 = new com.alibaba.fastjson.JSONPath$RangeSegement
                r0.<init>(r11, r8, r3)
                return r0
            Lf6:
                java.lang.UnsupportedOperationException r11 = new java.lang.UnsupportedOperationException
                java.lang.StringBuilder r0 = new java.lang.StringBuilder
                r0.<init>()
                java.lang.String r1 = "step must greater than zero : "
                r0.append(r1)
                r0.append(r3)
                java.lang.String r0 = r0.toString()
                r11.<init>(r0)
                throw r11
            L10d:
                java.lang.UnsupportedOperationException r11 = new java.lang.UnsupportedOperationException
                r11.<init>()
                throw r11
        }

        public com.alibaba.fastjson.JSONPath.Segement[] explain() {
                r5 = this;
                java.lang.String r0 = r5.path
                if (r0 == 0) goto L39
                int r0 = r0.length()
                if (r0 == 0) goto L39
                r0 = 8
                com.alibaba.fastjson.JSONPath$Segement[] r0 = new com.alibaba.fastjson.JSONPath.Segement[r0]
            Le:
                com.alibaba.fastjson.JSONPath$Segement r1 = r5.readSegement()
                r2 = 0
                if (r1 != 0) goto L21
                int r1 = r5.level
                int r3 = r0.length
                if (r1 != r3) goto L1b
                return r0
            L1b:
                com.alibaba.fastjson.JSONPath$Segement[] r3 = new com.alibaba.fastjson.JSONPath.Segement[r1]
                java.lang.System.arraycopy(r0, r2, r3, r2, r1)
                return r3
            L21:
                int r3 = r5.level
                int r4 = r0.length
                if (r3 != r4) goto L30
                int r4 = r3 * 3
                int r4 = r4 / 2
                com.alibaba.fastjson.JSONPath$Segement[] r4 = new com.alibaba.fastjson.JSONPath.Segement[r4]
                java.lang.System.arraycopy(r0, r2, r4, r2, r3)
                r0 = r4
            L30:
                int r2 = r5.level
                int r3 = r2 + 1
                r5.level = r3
                r0[r2] = r1
                goto Le
            L39:
                java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
                r0.<init>()
                throw r0
        }

        boolean isEOF() {
                r2 = this;
                int r0 = r2.pos
                java.lang.String r1 = r2.path
                int r1 = r1.length()
                if (r0 < r1) goto Lc
                r0 = 1
                return r0
            Lc:
                r0 = 0
                return r0
        }

        void next() {
                r3 = this;
                java.lang.String r0 = r3.path
                int r1 = r3.pos
                int r2 = r1 + 1
                r3.pos = r2
                char r0 = r0.charAt(r1)
                r3.ch = r0
                return
        }

        com.alibaba.fastjson.JSONPath.Segement parseArrayAccess(boolean r15) {
                r14 = this;
                if (r15 == 0) goto L7
                r0 = 91
                r14.accept(r0)
            L7:
                char r0 = r14.ch
                r1 = 63
                r2 = 40
                r3 = 46
                r4 = 0
                r5 = 1
                if (r0 != r1) goto L27
                r14.next()
                r14.accept(r2)
                char r0 = r14.ch
                r1 = 64
                if (r0 != r1) goto L25
                r14.next()
                r14.accept(r3)
            L25:
                r0 = 1
                goto L28
            L27:
                r0 = 0
            L28:
                r1 = -1
                r6 = 93
                if (r0 != 0) goto L98
                char r7 = r14.ch
                boolean r7 = com.alibaba.fastjson.util.IOUtils.firstIdentifier(r7)
                if (r7 == 0) goto L36
                goto L98
            L36:
                int r2 = r14.pos
                int r2 = r2 - r5
            L39:
                char r7 = r14.ch
                r8 = 47
                if (r7 == r6) goto L5b
                if (r7 == r8) goto L5b
                boolean r7 = r14.isEOF()
                if (r7 != 0) goto L5b
                char r7 = r14.ch
                if (r7 != r3) goto L50
                if (r0 != 0) goto L50
                if (r0 != 0) goto L50
                goto L5b
            L50:
                r8 = 92
                if (r7 != r8) goto L57
                r14.next()
            L57:
                r14.next()
                goto L39
            L5b:
                if (r15 == 0) goto L61
                int r0 = r14.pos
            L5f:
                int r0 = r0 - r5
                goto L6e
            L61:
                char r0 = r14.ch
                if (r0 == r8) goto L6b
                if (r0 != r3) goto L68
                goto L6b
            L68:
                int r0 = r14.pos
                goto L6e
            L6b:
                int r0 = r14.pos
                goto L5f
            L6e:
                java.lang.String r3 = r14.path
                java.lang.String r0 = r3.substring(r2, r0)
                java.lang.String r2 = "\\."
                int r3 = r0.indexOf(r2)
                if (r3 == r1) goto L88
                java.lang.String r15 = "\\\\\\."
                java.lang.String r15 = r0.replaceAll(r15, r2)
                com.alibaba.fastjson.JSONPath$PropertySegement r0 = new com.alibaba.fastjson.JSONPath$PropertySegement
                r0.<init>(r15, r4)
                return r0
            L88:
                com.alibaba.fastjson.JSONPath$Segement r0 = r14.buildArraySegement(r0)
                if (r15 == 0) goto L97
                boolean r15 = r14.isEOF()
                if (r15 != 0) goto L97
                r14.accept(r6)
            L97:
                return r0
            L98:
                java.lang.String r8 = r14.readName()
                r14.skipWhitespace()
                r7 = 41
                if (r0 == 0) goto Lba
                char r9 = r14.ch
                if (r9 != r7) goto Lba
                r14.next()
                if (r15 == 0) goto Laf
                r14.accept(r6)
            Laf:
                com.alibaba.fastjson.JSONPath$FilterSegement r15 = new com.alibaba.fastjson.JSONPath$FilterSegement
                com.alibaba.fastjson.JSONPath$NotNullSegement r0 = new com.alibaba.fastjson.JSONPath$NotNullSegement
                r0.<init>(r8)
                r15.<init>(r0)
                return r15
            Lba:
                if (r15 == 0) goto Lce
                char r9 = r14.ch
                if (r9 != r6) goto Lce
                r14.next()
                com.alibaba.fastjson.JSONPath$FilterSegement r15 = new com.alibaba.fastjson.JSONPath$FilterSegement
                com.alibaba.fastjson.JSONPath$NotNullSegement r0 = new com.alibaba.fastjson.JSONPath$NotNullSegement
                r0.<init>(r8)
                r15.<init>(r0)
                return r15
            Lce:
                com.alibaba.fastjson.JSONPath$Operator r9 = r14.readOp()
                r14.skipWhitespace()
                com.alibaba.fastjson.JSONPath$Operator r10 = com.alibaba.fastjson.JSONPath.Operator.BETWEEN
                if (r9 == r10) goto L404
                com.alibaba.fastjson.JSONPath$Operator r10 = com.alibaba.fastjson.JSONPath.Operator.NOT_BETWEEN
                if (r9 != r10) goto Ldf
                goto L404
            Ldf:
                com.alibaba.fastjson.JSONPath$Operator r10 = com.alibaba.fastjson.JSONPath.Operator.IN
                if (r9 == r10) goto L2c7
                com.alibaba.fastjson.JSONPath$Operator r10 = com.alibaba.fastjson.JSONPath.Operator.NOT_IN
                if (r9 != r10) goto Le9
                goto L2c7
            Le9:
                char r2 = r14.ch
                r10 = 39
                if (r2 == r10) goto L1f3
                r10 = 34
                if (r2 != r10) goto Lf5
                goto L1f3
            Lf5:
                boolean r1 = isDigitFirst(r2)
                if (r1 == 0) goto L12f
                long r1 = r14.readLongValue()
                char r4 = r14.ch
                r10 = 0
                if (r4 != r3) goto L10a
                double r3 = r14.readDoubleValue(r1)
                goto L10b
            L10a:
                r3 = r10
            L10b:
                if (r0 == 0) goto L110
                r14.accept(r7)
            L110:
                if (r15 == 0) goto L115
                r14.accept(r6)
            L115:
                int r15 = (r3 > r10 ? 1 : (r3 == r10 ? 0 : -1))
                if (r15 != 0) goto L124
                com.alibaba.fastjson.JSONPath$FilterSegement r15 = new com.alibaba.fastjson.JSONPath$FilterSegement
                com.alibaba.fastjson.JSONPath$IntOpSegement r0 = new com.alibaba.fastjson.JSONPath$IntOpSegement
                r0.<init>(r8, r1, r9)
                r15.<init>(r0)
                return r15
            L124:
                com.alibaba.fastjson.JSONPath$FilterSegement r15 = new com.alibaba.fastjson.JSONPath$FilterSegement
                com.alibaba.fastjson.JSONPath$DoubleOpSegement r0 = new com.alibaba.fastjson.JSONPath$DoubleOpSegement
                r0.<init>(r8, r3, r9)
                r15.<init>(r0)
                return r15
            L12f:
                char r15 = r14.ch
                r1 = 110(0x6e, float:1.54E-43)
                if (r15 != r1) goto L16d
                java.lang.String r15 = r14.readName()
                java.lang.String r1 = "null"
                boolean r15 = r1.equals(r15)
                if (r15 == 0) goto L1ed
                if (r0 == 0) goto L146
                r14.accept(r7)
            L146:
                r14.accept(r6)
                com.alibaba.fastjson.JSONPath$Operator r15 = com.alibaba.fastjson.JSONPath.Operator.EQ
                if (r9 != r15) goto L158
                com.alibaba.fastjson.JSONPath$FilterSegement r15 = new com.alibaba.fastjson.JSONPath$FilterSegement
                com.alibaba.fastjson.JSONPath$NullSegement r0 = new com.alibaba.fastjson.JSONPath$NullSegement
                r0.<init>(r8)
                r15.<init>(r0)
                return r15
            L158:
                com.alibaba.fastjson.JSONPath$Operator r15 = com.alibaba.fastjson.JSONPath.Operator.NE
                if (r9 != r15) goto L167
                com.alibaba.fastjson.JSONPath$FilterSegement r15 = new com.alibaba.fastjson.JSONPath$FilterSegement
                com.alibaba.fastjson.JSONPath$NotNullSegement r0 = new com.alibaba.fastjson.JSONPath$NotNullSegement
                r0.<init>(r8)
                r15.<init>(r0)
                return r15
            L167:
                java.lang.UnsupportedOperationException r15 = new java.lang.UnsupportedOperationException
                r15.<init>()
                throw r15
            L16d:
                r1 = 116(0x74, float:1.63E-43)
                if (r15 != r1) goto L1ad
                java.lang.String r15 = r14.readName()
                java.lang.String r1 = "true"
                boolean r15 = r1.equals(r15)
                if (r15 == 0) goto L1ed
                if (r0 == 0) goto L182
                r14.accept(r7)
            L182:
                r14.accept(r6)
                com.alibaba.fastjson.JSONPath$Operator r15 = com.alibaba.fastjson.JSONPath.Operator.EQ
                if (r9 != r15) goto L196
                com.alibaba.fastjson.JSONPath$FilterSegement r15 = new com.alibaba.fastjson.JSONPath$FilterSegement
                com.alibaba.fastjson.JSONPath$ValueSegment r0 = new com.alibaba.fastjson.JSONPath$ValueSegment
                java.lang.Boolean r1 = java.lang.Boolean.TRUE
                r0.<init>(r8, r1, r5)
                r15.<init>(r0)
                return r15
            L196:
                com.alibaba.fastjson.JSONPath$Operator r15 = com.alibaba.fastjson.JSONPath.Operator.NE
                if (r9 != r15) goto L1a7
                com.alibaba.fastjson.JSONPath$FilterSegement r15 = new com.alibaba.fastjson.JSONPath$FilterSegement
                com.alibaba.fastjson.JSONPath$ValueSegment r0 = new com.alibaba.fastjson.JSONPath$ValueSegment
                java.lang.Boolean r1 = java.lang.Boolean.TRUE
                r0.<init>(r8, r1, r4)
                r15.<init>(r0)
                return r15
            L1a7:
                java.lang.UnsupportedOperationException r15 = new java.lang.UnsupportedOperationException
                r15.<init>()
                throw r15
            L1ad:
                r1 = 102(0x66, float:1.43E-43)
                if (r15 != r1) goto L1ed
                java.lang.String r15 = r14.readName()
                java.lang.String r1 = "false"
                boolean r15 = r1.equals(r15)
                if (r15 == 0) goto L1ed
                if (r0 == 0) goto L1c2
                r14.accept(r7)
            L1c2:
                r14.accept(r6)
                com.alibaba.fastjson.JSONPath$Operator r15 = com.alibaba.fastjson.JSONPath.Operator.EQ
                if (r9 != r15) goto L1d6
                com.alibaba.fastjson.JSONPath$FilterSegement r15 = new com.alibaba.fastjson.JSONPath$FilterSegement
                com.alibaba.fastjson.JSONPath$ValueSegment r0 = new com.alibaba.fastjson.JSONPath$ValueSegment
                java.lang.Boolean r1 = java.lang.Boolean.FALSE
                r0.<init>(r8, r1, r5)
                r15.<init>(r0)
                return r15
            L1d6:
                com.alibaba.fastjson.JSONPath$Operator r15 = com.alibaba.fastjson.JSONPath.Operator.NE
                if (r9 != r15) goto L1e7
                com.alibaba.fastjson.JSONPath$FilterSegement r15 = new com.alibaba.fastjson.JSONPath$FilterSegement
                com.alibaba.fastjson.JSONPath$ValueSegment r0 = new com.alibaba.fastjson.JSONPath$ValueSegment
                java.lang.Boolean r1 = java.lang.Boolean.FALSE
                r0.<init>(r8, r1, r4)
                r15.<init>(r0)
                return r15
            L1e7:
                java.lang.UnsupportedOperationException r15 = new java.lang.UnsupportedOperationException
                r15.<init>()
                throw r15
            L1ed:
                java.lang.UnsupportedOperationException r15 = new java.lang.UnsupportedOperationException
                r15.<init>()
                throw r15
            L1f3:
                java.lang.String r2 = r14.readString()
                if (r0 == 0) goto L1fc
                r14.accept(r7)
            L1fc:
                if (r15 == 0) goto L201
                r14.accept(r6)
            L201:
                com.alibaba.fastjson.JSONPath$Operator r15 = com.alibaba.fastjson.JSONPath.Operator.RLIKE
                if (r9 != r15) goto L210
                com.alibaba.fastjson.JSONPath$FilterSegement r15 = new com.alibaba.fastjson.JSONPath$FilterSegement
                com.alibaba.fastjson.JSONPath$RlikeSegement r0 = new com.alibaba.fastjson.JSONPath$RlikeSegement
                r0.<init>(r8, r2, r4)
                r15.<init>(r0)
                return r15
            L210:
                com.alibaba.fastjson.JSONPath$Operator r15 = com.alibaba.fastjson.JSONPath.Operator.NOT_RLIKE
                if (r9 != r15) goto L21f
                com.alibaba.fastjson.JSONPath$FilterSegement r15 = new com.alibaba.fastjson.JSONPath$FilterSegement
                com.alibaba.fastjson.JSONPath$RlikeSegement r0 = new com.alibaba.fastjson.JSONPath$RlikeSegement
                r0.<init>(r8, r2, r5)
                r15.<init>(r0)
                return r15
            L21f:
                com.alibaba.fastjson.JSONPath$Operator r15 = com.alibaba.fastjson.JSONPath.Operator.LIKE
                if (r9 == r15) goto L227
                com.alibaba.fastjson.JSONPath$Operator r15 = com.alibaba.fastjson.JSONPath.Operator.NOT_LIKE
                if (r9 != r15) goto L24e
            L227:
                java.lang.String r15 = "%%"
                int r0 = r2.indexOf(r15)
                java.lang.String r3 = "%"
                if (r0 == r1) goto L236
                java.lang.String r2 = r2.replaceAll(r15, r3)
                goto L227
            L236:
                com.alibaba.fastjson.JSONPath$Operator r15 = com.alibaba.fastjson.JSONPath.Operator.NOT_LIKE
                if (r9 != r15) goto L23c
                r12 = 1
                goto L23d
            L23c:
                r12 = 0
            L23d:
                r15 = 37
                int r0 = r2.indexOf(r15)
                if (r0 != r1) goto L259
                com.alibaba.fastjson.JSONPath$Operator r15 = com.alibaba.fastjson.JSONPath.Operator.LIKE
                if (r9 != r15) goto L24c
                com.alibaba.fastjson.JSONPath$Operator r9 = com.alibaba.fastjson.JSONPath.Operator.EQ
                goto L24e
            L24c:
                com.alibaba.fastjson.JSONPath$Operator r9 = com.alibaba.fastjson.JSONPath.Operator.NE
            L24e:
                com.alibaba.fastjson.JSONPath$FilterSegement r15 = new com.alibaba.fastjson.JSONPath$FilterSegement
                com.alibaba.fastjson.JSONPath$StringOpSegement r0 = new com.alibaba.fastjson.JSONPath$StringOpSegement
                r0.<init>(r8, r2, r9)
                r15.<init>(r0)
                return r15
            L259:
                java.lang.String[] r1 = r2.split(r3)
                r3 = 0
                r6 = 2
                if (r0 != 0) goto L28d
                int r0 = r2.length()
                int r0 = r0 - r5
                char r0 = r2.charAt(r0)
                if (r0 != r15) goto L277
                int r15 = r1.length
                int r15 = r15 - r5
                java.lang.String[] r0 = new java.lang.String[r15]
                java.lang.System.arraycopy(r1, r5, r0, r4, r15)
                r11 = r0
            L274:
                r9 = r3
                r10 = r9
                goto L2bc
            L277:
                int r15 = r1.length
                int r15 = r15 - r5
                r15 = r1[r15]
                int r0 = r1.length
                if (r0 <= r6) goto L289
                int r0 = r1.length
                int r0 = r0 - r6
                java.lang.String[] r2 = new java.lang.String[r0]
                java.lang.System.arraycopy(r1, r5, r2, r4, r0)
            L285:
                r10 = r15
                r11 = r2
                r9 = r3
                goto L2bc
            L289:
                r10 = r15
                r9 = r3
                r11 = r9
                goto L2bc
            L28d:
                int r0 = r2.length()
                int r0 = r0 - r5
                char r0 = r2.charAt(r0)
                if (r0 != r15) goto L29a
                r11 = r1
                goto L274
            L29a:
                int r15 = r1.length
                if (r15 != r5) goto L2a3
                r15 = r1[r4]
                r9 = r15
                r10 = r3
                r11 = r10
                goto L2bc
            L2a3:
                int r15 = r1.length
                if (r15 != r6) goto L2ae
                r15 = r1[r4]
                r0 = r1[r5]
                r9 = r15
                r10 = r0
                r11 = r3
                goto L2bc
            L2ae:
                r3 = r1[r4]
                int r15 = r1.length
                int r15 = r15 - r5
                r15 = r1[r15]
                int r0 = r1.length
                int r0 = r0 - r6
                java.lang.String[] r2 = new java.lang.String[r0]
                java.lang.System.arraycopy(r1, r5, r2, r4, r0)
                goto L285
            L2bc:
                com.alibaba.fastjson.JSONPath$FilterSegement r15 = new com.alibaba.fastjson.JSONPath$FilterSegement
                com.alibaba.fastjson.JSONPath$MatchSegement r7 = new com.alibaba.fastjson.JSONPath$MatchSegement
                r7.<init>(r8, r9, r10, r11, r12)
                r15.<init>(r7)
                return r15
            L2c7:
                com.alibaba.fastjson.JSONPath$Operator r1 = com.alibaba.fastjson.JSONPath.Operator.NOT_IN
                if (r9 != r1) goto L2cd
                r1 = 1
                goto L2ce
            L2cd:
                r1 = 0
            L2ce:
                r14.accept(r2)
                com.alibaba.fastjson.JSONArray r2 = new com.alibaba.fastjson.JSONArray
                r2.<init>()
                java.lang.Object r3 = r14.readValue()
                r2.add(r3)
            L2dd:
                r14.skipWhitespace()
                char r3 = r14.ch
                r9 = 44
                if (r3 == r9) goto L3f8
                r14.accept(r7)
                if (r0 == 0) goto L2ee
                r14.accept(r7)
            L2ee:
                if (r15 == 0) goto L2f3
                r14.accept(r6)
            L2f3:
                java.util.Iterator r15 = r2.iterator()
                r0 = 1
                r3 = 1
                r6 = 1
            L2fa:
                boolean r7 = r15.hasNext()
                if (r7 == 0) goto L32a
                java.lang.Object r7 = r15.next()
                if (r7 != 0) goto L30a
                if (r0 == 0) goto L2fa
                r0 = 0
                goto L2fa
            L30a:
                java.lang.Class r7 = r7.getClass()
                if (r0 == 0) goto L322
                java.lang.Class<java.lang.Byte> r9 = java.lang.Byte.class
                if (r7 == r9) goto L322
                java.lang.Class<java.lang.Short> r9 = java.lang.Short.class
                if (r7 == r9) goto L322
                java.lang.Class<java.lang.Integer> r9 = java.lang.Integer.class
                if (r7 == r9) goto L322
                java.lang.Class<java.lang.Long> r9 = java.lang.Long.class
                if (r7 == r9) goto L322
                r0 = 0
                r6 = 0
            L322:
                if (r3 == 0) goto L2fa
                java.lang.Class<java.lang.String> r9 = java.lang.String.class
                if (r7 == r9) goto L2fa
                r3 = 0
                goto L2fa
            L32a:
                int r15 = r2.size()
                if (r15 != r5) goto L34e
                java.lang.Object r15 = r2.get(r4)
                if (r15 != 0) goto L34e
                if (r1 == 0) goto L343
                com.alibaba.fastjson.JSONPath$FilterSegement r15 = new com.alibaba.fastjson.JSONPath$FilterSegement
                com.alibaba.fastjson.JSONPath$NotNullSegement r0 = new com.alibaba.fastjson.JSONPath$NotNullSegement
                r0.<init>(r8)
                r15.<init>(r0)
                return r15
            L343:
                com.alibaba.fastjson.JSONPath$FilterSegement r15 = new com.alibaba.fastjson.JSONPath$FilterSegement
                com.alibaba.fastjson.JSONPath$NullSegement r0 = new com.alibaba.fastjson.JSONPath$NullSegement
                r0.<init>(r8)
                r15.<init>(r0)
                return r15
            L34e:
                if (r0 == 0) goto L394
                int r15 = r2.size()
                if (r15 != r5) goto L372
                java.lang.Object r15 = r2.get(r4)
                java.lang.Number r15 = (java.lang.Number) r15
                long r2 = r15.longValue()
                if (r1 == 0) goto L365
                com.alibaba.fastjson.JSONPath$Operator r15 = com.alibaba.fastjson.JSONPath.Operator.NE
                goto L367
            L365:
                com.alibaba.fastjson.JSONPath$Operator r15 = com.alibaba.fastjson.JSONPath.Operator.EQ
            L367:
                com.alibaba.fastjson.JSONPath$FilterSegement r0 = new com.alibaba.fastjson.JSONPath$FilterSegement
                com.alibaba.fastjson.JSONPath$IntOpSegement r1 = new com.alibaba.fastjson.JSONPath$IntOpSegement
                r1.<init>(r8, r2, r15)
                r0.<init>(r1)
                return r0
            L372:
                int r15 = r2.size()
                long[] r0 = new long[r15]
            L378:
                if (r4 >= r15) goto L389
                java.lang.Object r3 = r2.get(r4)
                java.lang.Number r3 = (java.lang.Number) r3
                long r5 = r3.longValue()
                r0[r4] = r5
                int r4 = r4 + 1
                goto L378
            L389:
                com.alibaba.fastjson.JSONPath$FilterSegement r15 = new com.alibaba.fastjson.JSONPath$FilterSegement
                com.alibaba.fastjson.JSONPath$IntInSegement r2 = new com.alibaba.fastjson.JSONPath$IntInSegement
                r2.<init>(r8, r0, r1)
                r15.<init>(r2)
                return r15
            L394:
                if (r3 == 0) goto L3c8
                int r15 = r2.size()
                if (r15 != r5) goto L3b4
                java.lang.Object r15 = r2.get(r4)
                java.lang.String r15 = (java.lang.String) r15
                if (r1 == 0) goto L3a7
                com.alibaba.fastjson.JSONPath$Operator r0 = com.alibaba.fastjson.JSONPath.Operator.NE
                goto L3a9
            L3a7:
                com.alibaba.fastjson.JSONPath$Operator r0 = com.alibaba.fastjson.JSONPath.Operator.EQ
            L3a9:
                com.alibaba.fastjson.JSONPath$FilterSegement r1 = new com.alibaba.fastjson.JSONPath$FilterSegement
                com.alibaba.fastjson.JSONPath$StringOpSegement r2 = new com.alibaba.fastjson.JSONPath$StringOpSegement
                r2.<init>(r8, r15, r0)
                r1.<init>(r2)
                return r1
            L3b4:
                int r15 = r2.size()
                java.lang.String[] r15 = new java.lang.String[r15]
                r2.toArray(r15)
                com.alibaba.fastjson.JSONPath$FilterSegement r0 = new com.alibaba.fastjson.JSONPath$FilterSegement
                com.alibaba.fastjson.JSONPath$StringInSegement r2 = new com.alibaba.fastjson.JSONPath$StringInSegement
                r2.<init>(r8, r15, r1)
                r0.<init>(r2)
                return r0
            L3c8:
                if (r6 == 0) goto L3f2
                int r15 = r2.size()
                java.lang.Long[] r0 = new java.lang.Long[r15]
            L3d0:
                if (r4 >= r15) goto L3e7
                java.lang.Object r3 = r2.get(r4)
                java.lang.Number r3 = (java.lang.Number) r3
                if (r3 == 0) goto L3e4
                long r5 = r3.longValue()
                java.lang.Long r3 = java.lang.Long.valueOf(r5)
                r0[r4] = r3
            L3e4:
                int r4 = r4 + 1
                goto L3d0
            L3e7:
                com.alibaba.fastjson.JSONPath$FilterSegement r15 = new com.alibaba.fastjson.JSONPath$FilterSegement
                com.alibaba.fastjson.JSONPath$IntObjInSegement r2 = new com.alibaba.fastjson.JSONPath$IntObjInSegement
                r2.<init>(r8, r0, r1)
                r15.<init>(r2)
                return r15
            L3f2:
                java.lang.UnsupportedOperationException r15 = new java.lang.UnsupportedOperationException
                r15.<init>()
                throw r15
            L3f8:
                r14.next()
                java.lang.Object r3 = r14.readValue()
                r2.add(r3)
                goto L2dd
            L404:
                com.alibaba.fastjson.JSONPath$Operator r15 = com.alibaba.fastjson.JSONPath.Operator.NOT_BETWEEN
                if (r9 != r15) goto L40a
                r13 = 1
                goto L40b
            L40a:
                r13 = 0
            L40b:
                java.lang.Object r15 = r14.readValue()
                java.lang.String r0 = r14.readName()
                java.lang.String r1 = "and"
                boolean r0 = r1.equalsIgnoreCase(r0)
                if (r0 == 0) goto L45e
                java.lang.Object r0 = r14.readValue()
                if (r15 == 0) goto L456
                if (r0 == 0) goto L456
                java.lang.Class r1 = r15.getClass()
                boolean r1 = com.alibaba.fastjson.JSONPath.isInt(r1)
                if (r1 == 0) goto L44e
                java.lang.Class r1 = r0.getClass()
                boolean r1 = com.alibaba.fastjson.JSONPath.isInt(r1)
                if (r1 == 0) goto L44e
                com.alibaba.fastjson.JSONPath$IntBetweenSegement r7 = new com.alibaba.fastjson.JSONPath$IntBetweenSegement
                java.lang.Number r15 = (java.lang.Number) r15
                long r9 = r15.longValue()
                java.lang.Number r0 = (java.lang.Number) r0
                long r11 = r0.longValue()
                r7.<init>(r8, r9, r11, r13)
                com.alibaba.fastjson.JSONPath$FilterSegement r15 = new com.alibaba.fastjson.JSONPath$FilterSegement
                r15.<init>(r7)
                return r15
            L44e:
                com.alibaba.fastjson.JSONPathException r15 = new com.alibaba.fastjson.JSONPathException
                java.lang.String r0 = r14.path
                r15.<init>(r0)
                throw r15
            L456:
                com.alibaba.fastjson.JSONPathException r15 = new com.alibaba.fastjson.JSONPathException
                java.lang.String r0 = r14.path
                r15.<init>(r0)
                throw r15
            L45e:
                com.alibaba.fastjson.JSONPathException r15 = new com.alibaba.fastjson.JSONPathException
                java.lang.String r0 = r14.path
                r15.<init>(r0)
                throw r15
        }

        protected double readDoubleValue(long r4) {
                r3 = this;
                int r0 = r3.pos
                int r0 = r0 + (-1)
                r3.next()
            L7:
                char r1 = r3.ch
                r2 = 48
                if (r1 < r2) goto L15
                r2 = 57
                if (r1 > r2) goto L15
                r3.next()
                goto L7
            L15:
                int r1 = r3.pos
                int r1 = r1 + (-1)
                java.lang.String r2 = r3.path
                java.lang.String r0 = r2.substring(r0, r1)
                double r0 = java.lang.Double.parseDouble(r0)
                double r4 = (double) r4
                double r0 = r0 + r4
                return r0
        }

        protected long readLongValue() {
                r3 = this;
                int r0 = r3.pos
                int r0 = r0 + (-1)
                char r1 = r3.ch
                r2 = 43
                if (r1 == r2) goto Le
                r2 = 45
                if (r1 != r2) goto L11
            Le:
                r3.next()
            L11:
                char r1 = r3.ch
                r2 = 48
                if (r1 < r2) goto L1f
                r2 = 57
                if (r1 > r2) goto L1f
                r3.next()
                goto L11
            L1f:
                int r1 = r3.pos
                int r1 = r1 + (-1)
                java.lang.String r2 = r3.path
                java.lang.String r0 = r2.substring(r0, r1)
                long r0 = java.lang.Long.parseLong(r0)
                return r0
        }

        java.lang.String readName() {
                r3 = this;
                r3.skipWhitespace()
                char r0 = r3.ch
                r1 = 92
                if (r0 == r1) goto L29
                boolean r0 = com.alibaba.fastjson.util.IOUtils.firstIdentifier(r0)
                if (r0 == 0) goto L10
                goto L29
            L10:
                com.alibaba.fastjson.JSONPathException r0 = new com.alibaba.fastjson.JSONPathException
                java.lang.StringBuilder r1 = new java.lang.StringBuilder
                r1.<init>()
                java.lang.String r2 = "illeal jsonpath syntax. "
                r1.append(r2)
                java.lang.String r2 = r3.path
                r1.append(r2)
                java.lang.String r1 = r1.toString()
                r0.<init>(r1)
                throw r0
            L29:
                java.lang.StringBuilder r0 = new java.lang.StringBuilder
                r0.<init>()
            L2e:
                boolean r2 = r3.isEOF()
                if (r2 != 0) goto L5b
                char r2 = r3.ch
                if (r2 != r1) goto L4b
                r3.next()
                char r2 = r3.ch
                r0.append(r2)
                boolean r2 = r3.isEOF()
                if (r2 == 0) goto L47
                goto L5b
            L47:
                r3.next()
                goto L2e
            L4b:
                boolean r2 = com.alibaba.fastjson.util.IOUtils.isIdent(r2)
                if (r2 != 0) goto L52
                goto L5b
            L52:
                char r2 = r3.ch
                r0.append(r2)
                r3.next()
                goto L2e
            L5b:
                boolean r1 = r3.isEOF()
                if (r1 == 0) goto L6e
                char r1 = r3.ch
                boolean r1 = com.alibaba.fastjson.util.IOUtils.isIdent(r1)
                if (r1 == 0) goto L6e
                char r1 = r3.ch
                r0.append(r1)
            L6e:
                java.lang.String r0 = r0.toString()
                return r0
        }

        protected com.alibaba.fastjson.JSONPath.Operator readOp() {
                r6 = this;
                char r0 = r6.ch
                r1 = 61
                if (r0 != r1) goto Lc
                r6.next()
                com.alibaba.fastjson.JSONPath$Operator r0 = com.alibaba.fastjson.JSONPath.Operator.EQ
                goto L42
            Lc:
                r2 = 33
                if (r0 != r2) goto L19
                r6.next()
                r6.accept(r1)
                com.alibaba.fastjson.JSONPath$Operator r0 = com.alibaba.fastjson.JSONPath.Operator.NE
                goto L42
            L19:
                r2 = 60
                if (r0 != r2) goto L2d
                r6.next()
                char r0 = r6.ch
                if (r0 != r1) goto L2a
                r6.next()
                com.alibaba.fastjson.JSONPath$Operator r0 = com.alibaba.fastjson.JSONPath.Operator.LE
                goto L42
            L2a:
                com.alibaba.fastjson.JSONPath$Operator r0 = com.alibaba.fastjson.JSONPath.Operator.LT
                goto L42
            L2d:
                r2 = 62
                if (r0 != r2) goto L41
                r6.next()
                char r0 = r6.ch
                if (r0 != r1) goto L3e
                r6.next()
                com.alibaba.fastjson.JSONPath$Operator r0 = com.alibaba.fastjson.JSONPath.Operator.GE
                goto L42
            L3e:
                com.alibaba.fastjson.JSONPath$Operator r0 = com.alibaba.fastjson.JSONPath.Operator.GT
                goto L42
            L41:
                r0 = 0
            L42:
                if (r0 != 0) goto Lb3
                java.lang.String r0 = r6.readName()
                java.lang.String r1 = "not"
                boolean r1 = r1.equalsIgnoreCase(r0)
                java.lang.String r2 = "between"
                java.lang.String r3 = "in"
                java.lang.String r4 = "rlike"
                java.lang.String r5 = "like"
                if (r1 == 0) goto L89
                r6.skipWhitespace()
                java.lang.String r0 = r6.readName()
                boolean r1 = r5.equalsIgnoreCase(r0)
                if (r1 == 0) goto L68
                com.alibaba.fastjson.JSONPath$Operator r0 = com.alibaba.fastjson.JSONPath.Operator.NOT_LIKE
                return r0
            L68:
                boolean r1 = r4.equalsIgnoreCase(r0)
                if (r1 == 0) goto L71
                com.alibaba.fastjson.JSONPath$Operator r0 = com.alibaba.fastjson.JSONPath.Operator.NOT_RLIKE
                return r0
            L71:
                boolean r1 = r3.equalsIgnoreCase(r0)
                if (r1 == 0) goto L7a
                com.alibaba.fastjson.JSONPath$Operator r0 = com.alibaba.fastjson.JSONPath.Operator.NOT_IN
                return r0
            L7a:
                boolean r0 = r2.equalsIgnoreCase(r0)
                if (r0 == 0) goto L83
                com.alibaba.fastjson.JSONPath$Operator r0 = com.alibaba.fastjson.JSONPath.Operator.NOT_BETWEEN
                return r0
            L83:
                java.lang.UnsupportedOperationException r0 = new java.lang.UnsupportedOperationException
                r0.<init>()
                throw r0
            L89:
                boolean r1 = r5.equalsIgnoreCase(r0)
                if (r1 == 0) goto L92
                com.alibaba.fastjson.JSONPath$Operator r0 = com.alibaba.fastjson.JSONPath.Operator.LIKE
                return r0
            L92:
                boolean r1 = r4.equalsIgnoreCase(r0)
                if (r1 == 0) goto L9b
                com.alibaba.fastjson.JSONPath$Operator r0 = com.alibaba.fastjson.JSONPath.Operator.RLIKE
                return r0
            L9b:
                boolean r1 = r3.equalsIgnoreCase(r0)
                if (r1 == 0) goto La4
                com.alibaba.fastjson.JSONPath$Operator r0 = com.alibaba.fastjson.JSONPath.Operator.IN
                return r0
            La4:
                boolean r0 = r2.equalsIgnoreCase(r0)
                if (r0 == 0) goto Lad
                com.alibaba.fastjson.JSONPath$Operator r0 = com.alibaba.fastjson.JSONPath.Operator.BETWEEN
                return r0
            Lad:
                java.lang.UnsupportedOperationException r0 = new java.lang.UnsupportedOperationException
                r0.<init>()
                throw r0
            Lb3:
                return r0
        }

        com.alibaba.fastjson.JSONPath.Segement readSegement() {
                r5 = this;
                int r0 = r5.level
                r1 = 1
                r2 = 0
                if (r0 != 0) goto L3c
                java.lang.String r0 = r5.path
                int r0 = r0.length()
                if (r0 != r1) goto L3c
                char r0 = r5.ch
                boolean r0 = isDigitFirst(r0)
                if (r0 == 0) goto L20
                char r0 = r5.ch
                int r0 = r0 + (-48)
                com.alibaba.fastjson.JSONPath$ArrayAccessSegement r1 = new com.alibaba.fastjson.JSONPath$ArrayAccessSegement
                r1.<init>(r0)
                return r1
            L20:
                char r0 = r5.ch
                r3 = 97
                if (r0 < r3) goto L2a
                r3 = 122(0x7a, float:1.71E-43)
                if (r0 <= r3) goto L32
            L2a:
                r3 = 65
                if (r0 < r3) goto L3c
                r3 = 90
                if (r0 > r3) goto L3c
            L32:
                com.alibaba.fastjson.JSONPath$PropertySegement r1 = new com.alibaba.fastjson.JSONPath$PropertySegement
                java.lang.String r0 = java.lang.Character.toString(r0)
                r1.<init>(r0, r2)
                return r1
            L3c:
                boolean r0 = r5.isEOF()
                if (r0 != 0) goto Ld9
                r5.skipWhitespace()
                char r0 = r5.ch
                r3 = 36
                if (r0 != r3) goto L4f
                r5.next()
                goto L3c
            L4f:
                r3 = 46
                if (r0 == r3) goto L75
                r4 = 47
                if (r0 != r4) goto L58
                goto L75
            L58:
                r3 = 91
                if (r0 != r3) goto L61
                com.alibaba.fastjson.JSONPath$Segement r0 = r5.parseArrayAccess(r1)
                return r0
            L61:
                int r0 = r5.level
                if (r0 != 0) goto L6f
                java.lang.String r0 = r5.readName()
                com.alibaba.fastjson.JSONPath$PropertySegement r1 = new com.alibaba.fastjson.JSONPath$PropertySegement
                r1.<init>(r0, r2)
                return r1
            L6f:
                java.lang.UnsupportedOperationException r0 = new java.lang.UnsupportedOperationException
                r0.<init>()
                throw r0
            L75:
                r5.next()
                if (r0 != r3) goto L82
                char r0 = r5.ch
                if (r0 != r3) goto L82
                r5.next()
                goto L83
            L82:
                r1 = 0
            L83:
                char r0 = r5.ch
                r3 = 42
                if (r0 != r3) goto L95
                boolean r0 = r5.isEOF()
                if (r0 != 0) goto L92
                r5.next()
            L92:
                com.alibaba.fastjson.JSONPath$WildCardSegement r0 = com.alibaba.fastjson.JSONPath.WildCardSegement.instance
                return r0
            L95:
                boolean r0 = isDigitFirst(r0)
                if (r0 == 0) goto La0
                com.alibaba.fastjson.JSONPath$Segement r0 = r5.parseArrayAccess(r2)
                return r0
            La0:
                java.lang.String r0 = r5.readName()
                char r2 = r5.ch
                r3 = 40
                if (r2 != r3) goto Ld3
                r5.next()
                char r1 = r5.ch
                r2 = 41
                if (r1 != r2) goto Lcd
                boolean r1 = r5.isEOF()
                if (r1 != 0) goto Lbc
                r5.next()
            Lbc:
                java.lang.String r1 = "size"
                boolean r0 = r1.equals(r0)
                if (r0 == 0) goto Lc7
                com.alibaba.fastjson.JSONPath$SizeSegement r0 = com.alibaba.fastjson.JSONPath.SizeSegement.instance
                return r0
            Lc7:
                java.lang.UnsupportedOperationException r0 = new java.lang.UnsupportedOperationException
                r0.<init>()
                throw r0
            Lcd:
                java.lang.UnsupportedOperationException r0 = new java.lang.UnsupportedOperationException
                r0.<init>()
                throw r0
            Ld3:
                com.alibaba.fastjson.JSONPath$PropertySegement r2 = new com.alibaba.fastjson.JSONPath$PropertySegement
                r2.<init>(r0, r1)
                return r2
            Ld9:
                r0 = 0
                return r0
        }

        java.lang.String readString() {
                r4 = this;
                char r0 = r4.ch
                r4.next()
                int r1 = r4.pos
                int r1 = r1 + (-1)
            L9:
                char r2 = r4.ch
                if (r2 == r0) goto L17
                boolean r2 = r4.isEOF()
                if (r2 != 0) goto L17
                r4.next()
                goto L9
            L17:
                java.lang.String r2 = r4.path
                boolean r3 = r4.isEOF()
                if (r3 == 0) goto L22
                int r3 = r4.pos
                goto L26
            L22:
                int r3 = r4.pos
                int r3 = r3 + (-1)
            L26:
                java.lang.String r1 = r2.substring(r1, r3)
                r4.accept(r0)
                return r1
        }

        protected java.lang.Object readValue() {
                r2 = this;
                r2.skipWhitespace()
                char r0 = r2.ch
                boolean r0 = isDigitFirst(r0)
                if (r0 == 0) goto L14
                long r0 = r2.readLongValue()
                java.lang.Long r0 = java.lang.Long.valueOf(r0)
                return r0
            L14:
                char r0 = r2.ch
                r1 = 34
                if (r0 == r1) goto L3f
                r1 = 39
                if (r0 != r1) goto L1f
                goto L3f
            L1f:
                r1 = 110(0x6e, float:1.54E-43)
                if (r0 != r1) goto L39
                java.lang.String r0 = r2.readName()
                java.lang.String r1 = "null"
                boolean r0 = r1.equals(r0)
                if (r0 == 0) goto L31
                r0 = 0
                return r0
            L31:
                com.alibaba.fastjson.JSONPathException r0 = new com.alibaba.fastjson.JSONPathException
                java.lang.String r1 = r2.path
                r0.<init>(r1)
                throw r0
            L39:
                java.lang.UnsupportedOperationException r0 = new java.lang.UnsupportedOperationException
                r0.<init>()
                throw r0
            L3f:
                java.lang.String r0 = r2.readString()
                return r0
        }

        public final void skipWhitespace() {
                r2 = this;
            L0:
                char r0 = r2.ch
                r1 = 32
                if (r0 > r1) goto L20
                if (r0 == r1) goto L1c
                r1 = 13
                if (r0 == r1) goto L1c
                r1 = 10
                if (r0 == r1) goto L1c
                r1 = 9
                if (r0 == r1) goto L1c
                r1 = 12
                if (r0 == r1) goto L1c
                r1 = 8
                if (r0 != r1) goto L20
            L1c:
                r2.next()
                goto L0
            L20:
                return
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    static class MatchSegement implements com.alibaba.fastjson.JSONPath.Filter {
        private final java.lang.String[] containsValues;
        private final java.lang.String endsWithValue;
        private final int minLength;
        private final boolean not;
        private final java.lang.String propertyName;
        private final java.lang.String startsWithValue;

        public MatchSegement(java.lang.String r1, java.lang.String r2, java.lang.String r3, java.lang.String[] r4, boolean r5) {
                r0 = this;
                r0.<init>()
                r0.propertyName = r1
                r0.startsWithValue = r2
                r0.endsWithValue = r3
                r0.containsValues = r4
                r0.not = r5
                r1 = 0
                if (r2 == 0) goto L15
                int r2 = r2.length()
                goto L16
            L15:
                r2 = 0
            L16:
                if (r3 == 0) goto L1d
                int r3 = r3.length()
                int r2 = r2 + r3
            L1d:
                if (r4 == 0) goto L2c
                int r3 = r4.length
            L20:
                if (r1 >= r3) goto L2c
                r5 = r4[r1]
                int r5 = r5.length()
                int r2 = r2 + r5
                int r1 = r1 + 1
                goto L20
            L2c:
                r0.minLength = r2
                return
        }

        @Override // com.alibaba.fastjson.JSONPath.Filter
        public boolean apply(com.alibaba.fastjson.JSONPath r4, java.lang.Object r5, java.lang.Object r6, java.lang.Object r7) {
                r3 = this;
                java.lang.String r5 = r3.propertyName
                r6 = 0
                java.lang.Object r4 = r4.getPropertyValue(r7, r5, r6)
                if (r4 != 0) goto La
                return r6
            La:
                java.lang.String r4 = r4.toString()
                int r5 = r4.length()
                int r7 = r3.minLength
                if (r5 >= r7) goto L19
                boolean r4 = r3.not
                return r4
            L19:
                java.lang.String r5 = r3.startsWithValue
                if (r5 == 0) goto L2d
                boolean r5 = r4.startsWith(r5)
                if (r5 != 0) goto L26
                boolean r4 = r3.not
                return r4
            L26:
                java.lang.String r5 = r3.startsWithValue
                int r5 = r5.length()
                goto L2e
            L2d:
                r5 = 0
            L2e:
                java.lang.String[] r7 = r3.containsValues
                if (r7 == 0) goto L49
                int r0 = r7.length
            L33:
                if (r6 >= r0) goto L49
                r1 = r7[r6]
                int r5 = r4.indexOf(r1, r5)
                r2 = -1
                if (r5 != r2) goto L41
                boolean r4 = r3.not
                return r4
            L41:
                int r1 = r1.length()
                int r5 = r5 + r1
                int r6 = r6 + 1
                goto L33
            L49:
                java.lang.String r5 = r3.endsWithValue
                if (r5 == 0) goto L56
                boolean r4 = r4.endsWith(r5)
                if (r4 != 0) goto L56
                boolean r4 = r3.not
                return r4
            L56:
                boolean r4 = r3.not
                r4 = r4 ^ 1
                return r4
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    static class MultiIndexSegement implements com.alibaba.fastjson.JSONPath.Segement {
        private final int[] indexes;

        public MultiIndexSegement(int[] r1) {
                r0 = this;
                r0.<init>()
                r0.indexes = r1
                return
        }

        @Override // com.alibaba.fastjson.JSONPath.Segement
        public java.lang.Object eval(com.alibaba.fastjson.JSONPath r4, java.lang.Object r5, java.lang.Object r6) {
                r3 = this;
                java.util.ArrayList r5 = new java.util.ArrayList
                int[] r0 = r3.indexes
                int r0 = r0.length
                r5.<init>(r0)
                r0 = 0
            L9:
                int[] r1 = r3.indexes
                int r2 = r1.length
                if (r0 >= r2) goto L1a
                r1 = r1[r0]
                java.lang.Object r1 = r4.getArrayItem(r6, r1)
                r5.add(r1)
                int r0 = r0 + 1
                goto L9
            L1a:
                return r5
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    static class MultiPropertySegement implements com.alibaba.fastjson.JSONPath.Segement {
        private final java.lang.String[] propertyNames;

        public MultiPropertySegement(java.lang.String[] r1) {
                r0 = this;
                r0.<init>()
                r0.propertyNames = r1
                return
        }

        @Override // com.alibaba.fastjson.JSONPath.Segement
        public java.lang.Object eval(com.alibaba.fastjson.JSONPath r6, java.lang.Object r7, java.lang.Object r8) {
                r5 = this;
                java.util.ArrayList r7 = new java.util.ArrayList
                java.lang.String[] r0 = r5.propertyNames
                int r0 = r0.length
                r7.<init>(r0)
                java.lang.String[] r0 = r5.propertyNames
                int r1 = r0.length
                r2 = 0
            Lc:
                if (r2 >= r1) goto L1b
                r3 = r0[r2]
                r4 = 1
                java.lang.Object r3 = r6.getPropertyValue(r8, r3, r4)
                r7.add(r3)
                int r2 = r2 + 1
                goto Lc
            L1b:
                return r7
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    static class NotNullSegement implements com.alibaba.fastjson.JSONPath.Filter {
        private final java.lang.String propertyName;

        public NotNullSegement(java.lang.String r1) {
                r0 = this;
                r0.<init>()
                r0.propertyName = r1
                return
        }

        @Override // com.alibaba.fastjson.JSONPath.Filter
        public boolean apply(com.alibaba.fastjson.JSONPath r1, java.lang.Object r2, java.lang.Object r3, java.lang.Object r4) {
                r0 = this;
                java.lang.String r2 = r0.propertyName
                r3 = 0
                java.lang.Object r1 = r1.getPropertyValue(r4, r2, r3)
                if (r1 == 0) goto Lb
                r1 = 1
                return r1
            Lb:
                return r3
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    static class NullSegement implements com.alibaba.fastjson.JSONPath.Filter {
        private final java.lang.String propertyName;

        public NullSegement(java.lang.String r1) {
                r0 = this;
                r0.<init>()
                r0.propertyName = r1
                return
        }

        @Override // com.alibaba.fastjson.JSONPath.Filter
        public boolean apply(com.alibaba.fastjson.JSONPath r1, java.lang.Object r2, java.lang.Object r3, java.lang.Object r4) {
                r0 = this;
                java.lang.String r2 = r0.propertyName
                r3 = 0
                java.lang.Object r1 = r1.getPropertyValue(r4, r2, r3)
                if (r1 != 0) goto Lb
                r1 = 1
                return r1
            Lb:
                return r3
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    enum Operator extends java.lang.Enum<com.alibaba.fastjson.JSONPath.Operator> {
        private static final /* synthetic */ com.alibaba.fastjson.JSONPath.Operator[] $VALUES = null;
        public static final com.alibaba.fastjson.JSONPath.Operator BETWEEN = null;
        public static final com.alibaba.fastjson.JSONPath.Operator EQ = null;
        public static final com.alibaba.fastjson.JSONPath.Operator GE = null;
        public static final com.alibaba.fastjson.JSONPath.Operator GT = null;
        public static final com.alibaba.fastjson.JSONPath.Operator IN = null;
        public static final com.alibaba.fastjson.JSONPath.Operator LE = null;
        public static final com.alibaba.fastjson.JSONPath.Operator LIKE = null;
        public static final com.alibaba.fastjson.JSONPath.Operator LT = null;
        public static final com.alibaba.fastjson.JSONPath.Operator NE = null;
        public static final com.alibaba.fastjson.JSONPath.Operator NOT_BETWEEN = null;
        public static final com.alibaba.fastjson.JSONPath.Operator NOT_IN = null;
        public static final com.alibaba.fastjson.JSONPath.Operator NOT_LIKE = null;
        public static final com.alibaba.fastjson.JSONPath.Operator NOT_RLIKE = null;
        public static final com.alibaba.fastjson.JSONPath.Operator RLIKE = null;

        static {
                com.alibaba.fastjson.JSONPath$Operator r0 = new com.alibaba.fastjson.JSONPath$Operator
                java.lang.String r1 = "EQ"
                r2 = 0
                r0.<init>(r1, r2)
                com.alibaba.fastjson.JSONPath.Operator.EQ = r0
                com.alibaba.fastjson.JSONPath$Operator r1 = new com.alibaba.fastjson.JSONPath$Operator
                java.lang.String r3 = "NE"
                r4 = 1
                r1.<init>(r3, r4)
                com.alibaba.fastjson.JSONPath.Operator.NE = r1
                com.alibaba.fastjson.JSONPath$Operator r3 = new com.alibaba.fastjson.JSONPath$Operator
                java.lang.String r5 = "GT"
                r6 = 2
                r3.<init>(r5, r6)
                com.alibaba.fastjson.JSONPath.Operator.GT = r3
                com.alibaba.fastjson.JSONPath$Operator r5 = new com.alibaba.fastjson.JSONPath$Operator
                java.lang.String r7 = "GE"
                r8 = 3
                r5.<init>(r7, r8)
                com.alibaba.fastjson.JSONPath.Operator.GE = r5
                com.alibaba.fastjson.JSONPath$Operator r7 = new com.alibaba.fastjson.JSONPath$Operator
                java.lang.String r9 = "LT"
                r10 = 4
                r7.<init>(r9, r10)
                com.alibaba.fastjson.JSONPath.Operator.LT = r7
                com.alibaba.fastjson.JSONPath$Operator r9 = new com.alibaba.fastjson.JSONPath$Operator
                java.lang.String r11 = "LE"
                r12 = 5
                r9.<init>(r11, r12)
                com.alibaba.fastjson.JSONPath.Operator.LE = r9
                com.alibaba.fastjson.JSONPath$Operator r11 = new com.alibaba.fastjson.JSONPath$Operator
                java.lang.String r13 = "LIKE"
                r14 = 6
                r11.<init>(r13, r14)
                com.alibaba.fastjson.JSONPath.Operator.LIKE = r11
                com.alibaba.fastjson.JSONPath$Operator r13 = new com.alibaba.fastjson.JSONPath$Operator
                java.lang.String r15 = "NOT_LIKE"
                r16 = 0
                r2 = 7
                r13.<init>(r15, r2)
                com.alibaba.fastjson.JSONPath.Operator.NOT_LIKE = r13
                com.alibaba.fastjson.JSONPath$Operator r15 = new com.alibaba.fastjson.JSONPath$Operator
                r17 = 7
                java.lang.String r2 = "RLIKE"
                r18 = 1
                r4 = 8
                r15.<init>(r2, r4)
                com.alibaba.fastjson.JSONPath.Operator.RLIKE = r15
                com.alibaba.fastjson.JSONPath$Operator r2 = new com.alibaba.fastjson.JSONPath$Operator
                r19 = 8
                java.lang.String r4 = "NOT_RLIKE"
                r20 = 2
                r6 = 9
                r2.<init>(r4, r6)
                com.alibaba.fastjson.JSONPath.Operator.NOT_RLIKE = r2
                com.alibaba.fastjson.JSONPath$Operator r4 = new com.alibaba.fastjson.JSONPath$Operator
                r21 = 9
                java.lang.String r6 = "IN"
                r22 = 3
                r8 = 10
                r4.<init>(r6, r8)
                com.alibaba.fastjson.JSONPath.Operator.IN = r4
                com.alibaba.fastjson.JSONPath$Operator r6 = new com.alibaba.fastjson.JSONPath$Operator
                r23 = 10
                java.lang.String r8 = "NOT_IN"
                r24 = 4
                r10 = 11
                r6.<init>(r8, r10)
                com.alibaba.fastjson.JSONPath.Operator.NOT_IN = r6
                com.alibaba.fastjson.JSONPath$Operator r8 = new com.alibaba.fastjson.JSONPath$Operator
                r25 = 11
                java.lang.String r10 = "BETWEEN"
                r26 = 5
                r12 = 12
                r8.<init>(r10, r12)
                com.alibaba.fastjson.JSONPath.Operator.BETWEEN = r8
                com.alibaba.fastjson.JSONPath$Operator r10 = new com.alibaba.fastjson.JSONPath$Operator
                r27 = 12
                java.lang.String r12 = "NOT_BETWEEN"
                r28 = 6
                r14 = 13
                r10.<init>(r12, r14)
                com.alibaba.fastjson.JSONPath.Operator.NOT_BETWEEN = r10
                r12 = 14
                com.alibaba.fastjson.JSONPath$Operator[] r12 = new com.alibaba.fastjson.JSONPath.Operator[r12]
                r12[r16] = r0
                r12[r18] = r1
                r12[r20] = r3
                r12[r22] = r5
                r12[r24] = r7
                r12[r26] = r9
                r12[r28] = r11
                r12[r17] = r13
                r12[r19] = r15
                r12[r21] = r2
                r12[r23] = r4
                r12[r25] = r6
                r12[r27] = r8
                r12[r14] = r10
                com.alibaba.fastjson.JSONPath.Operator.$VALUES = r12
                return
        }

        Operator(java.lang.String r1, int r2) {
                r0 = this;
                r0.<init>(r1, r2)
                return
        }

        public static com.alibaba.fastjson.JSONPath.Operator valueOf(java.lang.String r1) {
                java.lang.Class<com.alibaba.fastjson.JSONPath$Operator> r0 = com.alibaba.fastjson.JSONPath.Operator.class
                java.lang.Enum r1 = java.lang.Enum.valueOf(r0, r1)
                com.alibaba.fastjson.JSONPath$Operator r1 = (com.alibaba.fastjson.JSONPath.Operator) r1
                return r1
        }

        public static com.alibaba.fastjson.JSONPath.Operator[] values() {
                com.alibaba.fastjson.JSONPath$Operator[] r0 = com.alibaba.fastjson.JSONPath.Operator.$VALUES
                java.lang.Object r0 = r0.clone()
                com.alibaba.fastjson.JSONPath$Operator[] r0 = (com.alibaba.fastjson.JSONPath.Operator[]) r0
                return r0
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    static class PropertySegement implements com.alibaba.fastjson.JSONPath.Segement {
        private final boolean deep;
        private final java.lang.String propertyName;

        public PropertySegement(java.lang.String r1, boolean r2) {
                r0 = this;
                r0.<init>()
                r0.propertyName = r1
                r0.deep = r2
                return
        }

        static /* synthetic */ java.lang.String access$000(com.alibaba.fastjson.JSONPath.PropertySegement r0) {
                java.lang.String r0 = r0.propertyName
                return r0
        }

        @Override // com.alibaba.fastjson.JSONPath.Segement
        public java.lang.Object eval(com.alibaba.fastjson.JSONPath r2, java.lang.Object r3, java.lang.Object r4) {
                r1 = this;
                boolean r3 = r1.deep
                if (r3 == 0) goto Lf
                java.util.ArrayList r3 = new java.util.ArrayList
                r3.<init>()
                java.lang.String r0 = r1.propertyName
                r2.deepScan(r4, r0, r3)
                return r3
            Lf:
                java.lang.String r3 = r1.propertyName
                r0 = 1
                java.lang.Object r2 = r2.getPropertyValue(r4, r3, r0)
                return r2
        }

        public boolean remove(com.alibaba.fastjson.JSONPath r2, java.lang.Object r3) {
                r1 = this;
                java.lang.String r0 = r1.propertyName
                boolean r2 = r2.removePropertyValue(r3, r0)
                return r2
        }

        public void setValue(com.alibaba.fastjson.JSONPath r2, java.lang.Object r3, java.lang.Object r4) {
                r1 = this;
                boolean r0 = r1.deep
                if (r0 == 0) goto La
                java.lang.String r0 = r1.propertyName
                r2.deepSet(r3, r0, r4)
                return
            La:
                java.lang.String r0 = r1.propertyName
                r2.setPropertyValue(r3, r0, r4)
                return
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    static class RangeSegement implements com.alibaba.fastjson.JSONPath.Segement {
        private final int end;
        private final int start;
        private final int step;

        public RangeSegement(int r1, int r2, int r3) {
                r0 = this;
                r0.<init>()
                r0.start = r1
                r0.end = r2
                r0.step = r3
                return
        }

        @Override // com.alibaba.fastjson.JSONPath.Segement
        public java.lang.Object eval(com.alibaba.fastjson.JSONPath r5, java.lang.Object r6, java.lang.Object r7) {
                r4 = this;
                com.alibaba.fastjson.JSONPath$SizeSegement r0 = com.alibaba.fastjson.JSONPath.SizeSegement.instance
                java.lang.Integer r6 = r0.eval(r5, r6, r7)
                int r6 = r6.intValue()
                int r0 = r4.start
                if (r0 < 0) goto Lf
                goto L10
            Lf:
                int r0 = r0 + r6
            L10:
                int r1 = r4.end
                if (r1 < 0) goto L15
                goto L16
            L15:
                int r1 = r1 + r6
            L16:
                int r2 = r1 - r0
                int r3 = r4.step
                int r2 = r2 / r3
                int r2 = r2 + 1
                r3 = -1
                if (r2 != r3) goto L22
                r5 = 0
                return r5
            L22:
                java.util.ArrayList r3 = new java.util.ArrayList
                r3.<init>(r2)
            L27:
                if (r0 > r1) goto L36
                if (r0 >= r6) goto L36
                java.lang.Object r2 = r5.getArrayItem(r7, r0)
                r3.add(r2)
                int r2 = r4.step
                int r0 = r0 + r2
                goto L27
            L36:
                return r3
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    static class RlikeSegement implements com.alibaba.fastjson.JSONPath.Filter {
        private final boolean not;
        private final java.util.regex.Pattern pattern;
        private final java.lang.String propertyName;

        public RlikeSegement(java.lang.String r1, java.lang.String r2, boolean r3) {
                r0 = this;
                r0.<init>()
                r0.propertyName = r1
                java.util.regex.Pattern r1 = java.util.regex.Pattern.compile(r2)
                r0.pattern = r1
                r0.not = r3
                return
        }

        @Override // com.alibaba.fastjson.JSONPath.Filter
        public boolean apply(com.alibaba.fastjson.JSONPath r1, java.lang.Object r2, java.lang.Object r3, java.lang.Object r4) {
                r0 = this;
                java.lang.String r2 = r0.propertyName
                r3 = 0
                java.lang.Object r1 = r1.getPropertyValue(r4, r2, r3)
                if (r1 != 0) goto La
                return r3
            La:
                java.lang.String r1 = r1.toString()
                java.util.regex.Pattern r2 = r0.pattern
                java.util.regex.Matcher r1 = r2.matcher(r1)
                boolean r1 = r1.matches()
                boolean r2 = r0.not
                if (r2 == 0) goto L1e
                r1 = r1 ^ 1
            L1e:
                return r1
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    interface Segement {
        java.lang.Object eval(com.alibaba.fastjson.JSONPath r1, java.lang.Object r2, java.lang.Object r3);
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    static class SizeSegement implements com.alibaba.fastjson.JSONPath.Segement {
        public static final com.alibaba.fastjson.JSONPath.SizeSegement instance = null;

        static {
                com.alibaba.fastjson.JSONPath$SizeSegement r0 = new com.alibaba.fastjson.JSONPath$SizeSegement
                r0.<init>()
                com.alibaba.fastjson.JSONPath.SizeSegement.instance = r0
                return
        }

        SizeSegement() {
                r0 = this;
                r0.<init>()
                return
        }

        @Override // com.alibaba.fastjson.JSONPath.Segement
        public java.lang.Integer eval(com.alibaba.fastjson.JSONPath r1, java.lang.Object r2, java.lang.Object r3) {
                r0 = this;
                int r1 = r1.evalSize(r3)
                java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
                return r1
        }

        @Override // com.alibaba.fastjson.JSONPath.Segement
        public /* bridge */ /* synthetic */ java.lang.Object eval(com.alibaba.fastjson.JSONPath r1, java.lang.Object r2, java.lang.Object r3) {
                r0 = this;
                java.lang.Integer r1 = r0.eval(r1, r2, r3)
                return r1
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    static class StringInSegement implements com.alibaba.fastjson.JSONPath.Filter {
        private final boolean not;
        private final java.lang.String propertyName;
        private final java.lang.String[] values;

        public StringInSegement(java.lang.String r1, java.lang.String[] r2, boolean r3) {
                r0 = this;
                r0.<init>()
                r0.propertyName = r1
                r0.values = r2
                r0.not = r3
                return
        }

        @Override // com.alibaba.fastjson.JSONPath.Filter
        public boolean apply(com.alibaba.fastjson.JSONPath r2, java.lang.Object r3, java.lang.Object r4, java.lang.Object r5) {
                r1 = this;
                java.lang.String r3 = r1.propertyName
                r4 = 0
                java.lang.Object r2 = r2.getPropertyValue(r5, r3, r4)
                java.lang.String[] r3 = r1.values
                int r5 = r3.length
            La:
                if (r4 >= r5) goto L23
                r0 = r3[r4]
                if (r0 != r2) goto L15
                boolean r2 = r1.not
            L12:
                r2 = r2 ^ 1
                return r2
            L15:
                if (r0 == 0) goto L20
                boolean r0 = r0.equals(r2)
                if (r0 == 0) goto L20
                boolean r2 = r1.not
                goto L12
            L20:
                int r4 = r4 + 1
                goto La
            L23:
                boolean r2 = r1.not
                return r2
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    static class StringOpSegement implements com.alibaba.fastjson.JSONPath.Filter {
        private final com.alibaba.fastjson.JSONPath.Operator op;
        private final java.lang.String propertyName;
        private final java.lang.String value;

        public StringOpSegement(java.lang.String r1, java.lang.String r2, com.alibaba.fastjson.JSONPath.Operator r3) {
                r0 = this;
                r0.<init>()
                r0.propertyName = r1
                r0.value = r2
                r0.op = r3
                return
        }

        @Override // com.alibaba.fastjson.JSONPath.Filter
        public boolean apply(com.alibaba.fastjson.JSONPath r2, java.lang.Object r3, java.lang.Object r4, java.lang.Object r5) {
                r1 = this;
                java.lang.String r3 = r1.propertyName
                r4 = 0
                java.lang.Object r2 = r2.getPropertyValue(r5, r3, r4)
                com.alibaba.fastjson.JSONPath$Operator r3 = r1.op
                com.alibaba.fastjson.JSONPath$Operator r5 = com.alibaba.fastjson.JSONPath.Operator.EQ
                if (r3 != r5) goto L14
                java.lang.String r3 = r1.value
                boolean r2 = r3.equals(r2)
                return r2
            L14:
                com.alibaba.fastjson.JSONPath$Operator r5 = com.alibaba.fastjson.JSONPath.Operator.NE
                r0 = 1
                if (r3 != r5) goto L21
                java.lang.String r3 = r1.value
                boolean r2 = r3.equals(r2)
                r2 = r2 ^ r0
                return r2
            L21:
                if (r2 != 0) goto L24
                return r4
            L24:
                java.lang.String r3 = r1.value
                java.lang.String r2 = r2.toString()
                int r2 = r3.compareTo(r2)
                com.alibaba.fastjson.JSONPath$Operator r3 = r1.op
                com.alibaba.fastjson.JSONPath$Operator r5 = com.alibaba.fastjson.JSONPath.Operator.GE
                if (r3 != r5) goto L38
                if (r2 > 0) goto L37
                return r0
            L37:
                return r4
            L38:
                com.alibaba.fastjson.JSONPath$Operator r5 = com.alibaba.fastjson.JSONPath.Operator.GT
                if (r3 != r5) goto L40
                if (r2 >= 0) goto L3f
                return r0
            L3f:
                return r4
            L40:
                com.alibaba.fastjson.JSONPath$Operator r5 = com.alibaba.fastjson.JSONPath.Operator.LE
                if (r3 != r5) goto L48
                if (r2 < 0) goto L47
                return r0
            L47:
                return r4
            L48:
                com.alibaba.fastjson.JSONPath$Operator r5 = com.alibaba.fastjson.JSONPath.Operator.LT
                if (r3 != r5) goto L4f
                if (r2 <= 0) goto L4f
                return r0
            L4f:
                return r4
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    static class ValueSegment implements com.alibaba.fastjson.JSONPath.Filter {
        private boolean eq;
        private final java.lang.String propertyName;
        private final java.lang.Object value;

        public ValueSegment(java.lang.String r2, java.lang.Object r3, boolean r4) {
                r1 = this;
                r1.<init>()
                r0 = 1
                r1.eq = r0
                if (r3 == 0) goto Lf
                r1.propertyName = r2
                r1.value = r3
                r1.eq = r4
                return
            Lf:
                java.lang.IllegalArgumentException r2 = new java.lang.IllegalArgumentException
                java.lang.String r3 = "value is null"
                r2.<init>(r3)
                throw r2
        }

        @Override // com.alibaba.fastjson.JSONPath.Filter
        public boolean apply(com.alibaba.fastjson.JSONPath r1, java.lang.Object r2, java.lang.Object r3, java.lang.Object r4) {
                r0 = this;
                java.lang.String r2 = r0.propertyName
                r3 = 0
                java.lang.Object r1 = r1.getPropertyValue(r4, r2, r3)
                java.lang.Object r2 = r0.value
                boolean r1 = r2.equals(r1)
                boolean r2 = r0.eq
                if (r2 != 0) goto L13
                r1 = r1 ^ 1
            L13:
                return r1
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    static class WildCardSegement implements com.alibaba.fastjson.JSONPath.Segement {
        public static com.alibaba.fastjson.JSONPath.WildCardSegement instance;

        static {
                com.alibaba.fastjson.JSONPath$WildCardSegement r0 = new com.alibaba.fastjson.JSONPath$WildCardSegement
                r0.<init>()
                com.alibaba.fastjson.JSONPath.WildCardSegement.instance = r0
                return
        }

        WildCardSegement() {
                r0 = this;
                r0.<init>()
                return
        }

        @Override // com.alibaba.fastjson.JSONPath.Segement
        public java.lang.Object eval(com.alibaba.fastjson.JSONPath r1, java.lang.Object r2, java.lang.Object r3) {
                r0 = this;
                java.util.Collection r1 = r1.getPropertyValues(r3)
                return r1
        }
    }

    static {
            java.util.concurrent.ConcurrentHashMap r0 = new java.util.concurrent.ConcurrentHashMap
            r1 = 1061158912(0x3f400000, float:0.75)
            r2 = 1
            r3 = 128(0x80, float:1.8E-43)
            r0.<init>(r3, r1, r2)
            com.alibaba.fastjson.JSONPath.pathCache = r0
            return
    }

    public JSONPath(java.lang.String r3) {
            r2 = this;
            com.alibaba.fastjson.serializer.SerializeConfig r0 = com.alibaba.fastjson.serializer.SerializeConfig.getGlobalInstance()
            com.alibaba.fastjson.parser.ParserConfig r1 = com.alibaba.fastjson.parser.ParserConfig.getGlobalInstance()
            r2.<init>(r3, r0, r1)
            return
    }

    public JSONPath(java.lang.String r2, com.alibaba.fastjson.serializer.SerializeConfig r3, com.alibaba.fastjson.parser.ParserConfig r4) {
            r1 = this;
            r1.<init>()
            if (r2 == 0) goto L12
            int r0 = r2.length()
            if (r0 == 0) goto L12
            r1.path = r2
            r1.serializeConfig = r3
            r1.parserConfig = r4
            return
        L12:
            com.alibaba.fastjson.JSONPathException r2 = new com.alibaba.fastjson.JSONPathException
            java.lang.String r3 = "json-path can not be null or empty"
            r2.<init>(r3)
            throw r2
    }

    public static void arrayAdd(java.lang.Object r0, java.lang.String r1, java.lang.Object... r2) {
            com.alibaba.fastjson.JSONPath r1 = compile(r1)
            r1.arrayAdd(r0, r2)
            return
    }

    public static com.alibaba.fastjson.JSONPath compile(java.lang.String r3) {
            if (r3 == 0) goto L2a
            java.util.concurrent.ConcurrentMap<java.lang.String, com.alibaba.fastjson.JSONPath> r0 = com.alibaba.fastjson.JSONPath.pathCache
            java.lang.Object r0 = r0.get(r3)
            com.alibaba.fastjson.JSONPath r0 = (com.alibaba.fastjson.JSONPath) r0
            if (r0 != 0) goto L29
            com.alibaba.fastjson.JSONPath r0 = new com.alibaba.fastjson.JSONPath
            r0.<init>(r3)
            java.util.concurrent.ConcurrentMap<java.lang.String, com.alibaba.fastjson.JSONPath> r1 = com.alibaba.fastjson.JSONPath.pathCache
            int r1 = r1.size()
            int r2 = com.alibaba.fastjson.JSONPath.CACHE_SIZE
            if (r1 >= r2) goto L29
            java.util.concurrent.ConcurrentMap<java.lang.String, com.alibaba.fastjson.JSONPath> r1 = com.alibaba.fastjson.JSONPath.pathCache
            r1.putIfAbsent(r3, r0)
            java.util.concurrent.ConcurrentMap<java.lang.String, com.alibaba.fastjson.JSONPath> r0 = com.alibaba.fastjson.JSONPath.pathCache
            java.lang.Object r3 = r0.get(r3)
            com.alibaba.fastjson.JSONPath r3 = (com.alibaba.fastjson.JSONPath) r3
            return r3
        L29:
            return r0
        L2a:
            com.alibaba.fastjson.JSONPathException r3 = new com.alibaba.fastjson.JSONPathException
            java.lang.String r0 = "jsonpath can not be null"
            r3.<init>(r0)
            throw r3
    }

    public static boolean contains(java.lang.Object r0, java.lang.String r1) {
            if (r0 != 0) goto L4
            r0 = 0
            return r0
        L4:
            com.alibaba.fastjson.JSONPath r1 = compile(r1)
            boolean r0 = r1.contains(r0)
            return r0
    }

    public static boolean containsValue(java.lang.Object r0, java.lang.String r1, java.lang.Object r2) {
            com.alibaba.fastjson.JSONPath r1 = compile(r1)
            boolean r0 = r1.containsValue(r0, r2)
            return r0
    }

    static boolean eq(java.lang.Object r3, java.lang.Object r4) {
            if (r3 != r4) goto L4
            r3 = 1
            return r3
        L4:
            r0 = 0
            if (r3 == 0) goto L30
            if (r4 != 0) goto La
            goto L30
        La:
            java.lang.Class r1 = r3.getClass()
            java.lang.Class r2 = r4.getClass()
            if (r1 != r2) goto L19
            boolean r3 = r3.equals(r4)
            return r3
        L19:
            boolean r1 = r3 instanceof java.lang.Number
            if (r1 == 0) goto L2b
            boolean r1 = r4 instanceof java.lang.Number
            if (r1 == 0) goto L2a
            java.lang.Number r3 = (java.lang.Number) r3
            java.lang.Number r4 = (java.lang.Number) r4
            boolean r3 = eqNotNull(r3, r4)
            return r3
        L2a:
            return r0
        L2b:
            boolean r3 = r3.equals(r4)
            return r3
        L30:
            return r0
    }

    static boolean eqNotNull(java.lang.Number r7, java.lang.Number r8) {
            java.lang.Class r0 = r7.getClass()
            boolean r1 = isInt(r0)
            java.lang.Class r2 = r8.getClass()
            boolean r3 = isInt(r2)
            boolean r4 = r7 instanceof java.math.BigDecimal
            if (r4 == 0) goto L26
            r4 = r7
            java.math.BigDecimal r4 = (java.math.BigDecimal) r4
            if (r3 == 0) goto L26
            long r7 = r8.longValue()
            java.math.BigDecimal r7 = java.math.BigDecimal.valueOf(r7)
            boolean r7 = r4.equals(r7)
            return r7
        L26:
            r4 = 1
            r5 = 0
            if (r1 == 0) goto L4e
            if (r3 == 0) goto L3a
            long r0 = r7.longValue()
            long r7 = r8.longValue()
            int r2 = (r0 > r7 ? 1 : (r0 == r7 ? 0 : -1))
            if (r2 != 0) goto L39
            return r4
        L39:
            return r5
        L3a:
            boolean r6 = r8 instanceof java.math.BigInteger
            if (r6 == 0) goto L4e
            r8 = r7
            java.math.BigInteger r8 = (java.math.BigInteger) r8
            long r0 = r7.longValue()
            java.math.BigInteger r7 = java.math.BigInteger.valueOf(r0)
            boolean r7 = r7.equals(r8)
            return r7
        L4e:
            if (r3 == 0) goto L63
            boolean r6 = r7 instanceof java.math.BigInteger
            if (r6 == 0) goto L63
            java.math.BigInteger r7 = (java.math.BigInteger) r7
            long r0 = r8.longValue()
            java.math.BigInteger r8 = java.math.BigInteger.valueOf(r0)
            boolean r7 = r7.equals(r8)
            return r7
        L63:
            boolean r0 = isDouble(r0)
            boolean r2 = isDouble(r2)
            if (r0 == 0) goto L6f
            if (r2 != 0) goto L77
        L6f:
            if (r0 == 0) goto L73
            if (r3 != 0) goto L77
        L73:
            if (r2 == 0) goto L84
            if (r1 == 0) goto L84
        L77:
            double r0 = r7.doubleValue()
            double r7 = r8.doubleValue()
            int r2 = (r0 > r7 ? 1 : (r0 == r7 ? 0 : -1))
            if (r2 != 0) goto L84
            return r4
        L84:
            return r5
    }

    public static java.lang.Object eval(java.lang.Object r0, java.lang.String r1) {
            com.alibaba.fastjson.JSONPath r1 = compile(r1)
            java.lang.Object r0 = r1.eval(r0)
            return r0
    }

    protected static boolean isDouble(java.lang.Class<?> r1) {
            java.lang.Class<java.lang.Float> r0 = java.lang.Float.class
            if (r1 == r0) goto Lb
            java.lang.Class<java.lang.Double> r0 = java.lang.Double.class
            if (r1 != r0) goto L9
            goto Lb
        L9:
            r1 = 0
            return r1
        Lb:
            r1 = 1
            return r1
    }

    protected static boolean isInt(java.lang.Class<?> r1) {
            java.lang.Class<java.lang.Byte> r0 = java.lang.Byte.class
            if (r1 == r0) goto L13
            java.lang.Class<java.lang.Short> r0 = java.lang.Short.class
            if (r1 == r0) goto L13
            java.lang.Class<java.lang.Integer> r0 = java.lang.Integer.class
            if (r1 == r0) goto L13
            java.lang.Class<java.lang.Long> r0 = java.lang.Long.class
            if (r1 != r0) goto L11
            goto L13
        L11:
            r1 = 0
            return r1
        L13:
            r1 = 1
            return r1
    }

    public static java.util.Map<java.lang.String, java.lang.Object> paths(java.lang.Object r1) {
            com.alibaba.fastjson.serializer.SerializeConfig r0 = com.alibaba.fastjson.serializer.SerializeConfig.globalInstance
            java.util.Map r1 = paths(r1, r0)
            return r1
    }

    public static java.util.Map<java.lang.String, java.lang.Object> paths(java.lang.Object r2, com.alibaba.fastjson.serializer.SerializeConfig r3) {
            java.util.IdentityHashMap r0 = new java.util.IdentityHashMap
            r0.<init>()
            java.lang.String r1 = "/"
            paths(r0, r1, r2, r3)
            java.util.HashMap r2 = new java.util.HashMap
            r2.<init>()
            java.util.Set r3 = r0.entrySet()
            java.util.Iterator r3 = r3.iterator()
        L17:
            boolean r0 = r3.hasNext()
            if (r0 == 0) goto L2f
            java.lang.Object r0 = r3.next()
            java.util.Map$Entry r0 = (java.util.Map.Entry) r0
            java.lang.Object r1 = r0.getValue()
            java.lang.Object r0 = r0.getKey()
            r2.put(r1, r0)
            goto L17
        L2f:
            return r2
    }

    private static void paths(java.util.Map<java.lang.Object, java.lang.String> r5, java.lang.String r6, java.lang.Object r7, com.alibaba.fastjson.serializer.SerializeConfig r8) {
            if (r7 != 0) goto L4
            goto L13b
        L4:
            boolean r0 = r5.containsKey(r7)
            if (r0 == 0) goto Lc
            goto L13b
        Lc:
            r5.put(r7, r6)
            boolean r0 = r7 instanceof java.util.Map
            java.lang.String r1 = "/"
            if (r0 == 0) goto L5a
            java.util.Map r7 = (java.util.Map) r7
            java.util.Set r7 = r7.entrySet()
            java.util.Iterator r7 = r7.iterator()
        L1f:
            boolean r0 = r7.hasNext()
            if (r0 == 0) goto L13b
            java.lang.Object r0 = r7.next()
            java.util.Map$Entry r0 = (java.util.Map.Entry) r0
            java.lang.Object r2 = r0.getKey()
            boolean r3 = r2 instanceof java.lang.String
            if (r3 == 0) goto L1f
            boolean r3 = r6.equals(r1)
            if (r3 == 0) goto L49
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
        L3e:
            r3.append(r1)
            r3.append(r2)
            java.lang.String r2 = r3.toString()
            goto L52
        L49:
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            r3.append(r6)
            goto L3e
        L52:
            java.lang.Object r0 = r0.getValue()
            paths(r5, r2, r0, r8)
            goto L1f
        L5a:
            boolean r0 = r7 instanceof java.util.Collection
            r2 = 0
            if (r0 == 0) goto L94
            java.util.Collection r7 = (java.util.Collection) r7
            java.util.Iterator r7 = r7.iterator()
        L65:
            boolean r0 = r7.hasNext()
            if (r0 == 0) goto L13b
            java.lang.Object r0 = r7.next()
            boolean r3 = r6.equals(r1)
            if (r3 == 0) goto L85
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
        L7a:
            r3.append(r1)
            r3.append(r2)
            java.lang.String r3 = r3.toString()
            goto L8e
        L85:
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            r3.append(r6)
            goto L7a
        L8e:
            paths(r5, r3, r0, r8)
            int r2 = r2 + 1
            goto L65
        L94:
            java.lang.Class r0 = r7.getClass()
            boolean r3 = r0.isArray()
            if (r3 == 0) goto Lcd
            int r0 = java.lang.reflect.Array.getLength(r7)
        La2:
            if (r2 >= r0) goto L13b
            java.lang.Object r3 = java.lang.reflect.Array.get(r7, r2)
            boolean r4 = r6.equals(r1)
            if (r4 == 0) goto Lbe
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>()
        Lb3:
            r4.append(r1)
            r4.append(r2)
            java.lang.String r4 = r4.toString()
            goto Lc7
        Lbe:
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>()
            r4.append(r6)
            goto Lb3
        Lc7:
            paths(r5, r4, r3, r8)
            int r2 = r2 + 1
            goto La2
        Lcd:
            boolean r2 = com.alibaba.fastjson.parser.ParserConfig.isPrimitive2(r0)
            if (r2 != 0) goto L13b
            boolean r2 = r0.isEnum()
            if (r2 == 0) goto Lda
            goto L13b
        Lda:
            com.alibaba.fastjson.serializer.ObjectSerializer r0 = r8.getObjectWriter(r0)
            boolean r2 = r0 instanceof com.alibaba.fastjson.serializer.JavaBeanSerializer
            if (r2 == 0) goto L13b
            com.alibaba.fastjson.serializer.JavaBeanSerializer r0 = (com.alibaba.fastjson.serializer.JavaBeanSerializer) r0
            java.util.Map r7 = r0.getFieldValuesMap(r7)     // Catch: java.lang.Exception -> L132
            java.util.Set r7 = r7.entrySet()     // Catch: java.lang.Exception -> L132
            java.util.Iterator r7 = r7.iterator()     // Catch: java.lang.Exception -> L132
        Lf0:
            boolean r0 = r7.hasNext()     // Catch: java.lang.Exception -> L132
            if (r0 == 0) goto L13b
            java.lang.Object r0 = r7.next()     // Catch: java.lang.Exception -> L132
            java.util.Map$Entry r0 = (java.util.Map.Entry) r0     // Catch: java.lang.Exception -> L132
            java.lang.Object r2 = r0.getKey()     // Catch: java.lang.Exception -> L132
            java.lang.String r2 = (java.lang.String) r2     // Catch: java.lang.Exception -> L132
            boolean r3 = androidx.activity.k.a(r2)     // Catch: java.lang.Exception -> L132
            if (r3 == 0) goto Lf0
            boolean r3 = r6.equals(r1)     // Catch: java.lang.Exception -> L132
            if (r3 == 0) goto L11e
            java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch: java.lang.Exception -> L132
            r3.<init>()     // Catch: java.lang.Exception -> L132
            r3.append(r1)     // Catch: java.lang.Exception -> L132
        L116:
            r3.append(r2)     // Catch: java.lang.Exception -> L132
            java.lang.String r2 = r3.toString()     // Catch: java.lang.Exception -> L132
            goto L12a
        L11e:
            java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch: java.lang.Exception -> L132
            r3.<init>()     // Catch: java.lang.Exception -> L132
            r3.append(r6)     // Catch: java.lang.Exception -> L132
            r3.append(r1)     // Catch: java.lang.Exception -> L132
            goto L116
        L12a:
            java.lang.Object r0 = r0.getValue()     // Catch: java.lang.Exception -> L132
            paths(r5, r2, r0, r8)     // Catch: java.lang.Exception -> L132
            goto Lf0
        L132:
            r5 = move-exception
            com.alibaba.fastjson.JSONException r6 = new com.alibaba.fastjson.JSONException
            java.lang.String r7 = "toJSON error"
            r6.<init>(r7, r5)
            throw r6
        L13b:
            return
    }

    public static java.lang.Object read(java.lang.String r0, java.lang.String r1) {
            java.lang.Object r0 = com.alibaba.fastjson.JSON.parse(r0)
            com.alibaba.fastjson.JSONPath r1 = compile(r1)
            java.lang.Object r0 = r1.eval(r0)
            return r0
    }

    public static boolean remove(java.lang.Object r0, java.lang.String r1) {
            com.alibaba.fastjson.JSONPath r1 = compile(r1)
            boolean r0 = r1.remove(r0)
            return r0
    }

    public static boolean set(java.lang.Object r0, java.lang.String r1, java.lang.Object r2) {
            com.alibaba.fastjson.JSONPath r1 = compile(r1)
            boolean r0 = r1.set(r0, r2)
            return r0
    }

    public static int size(java.lang.Object r0, java.lang.String r1) {
            com.alibaba.fastjson.JSONPath r1 = compile(r1)
            java.lang.Object r0 = r1.eval(r0)
            int r0 = r1.evalSize(r0)
            return r0
    }

    public void arrayAdd(java.lang.Object r7, java.lang.Object... r8) {
            r6 = this;
            if (r8 == 0) goto Lb2
            int r0 = r8.length
            if (r0 != 0) goto L7
            goto Lb2
        L7:
            if (r7 != 0) goto Lb
            goto Lb2
        Lb:
            r6.init()
            r0 = 0
            r1 = 0
            r3 = r7
            r2 = 0
        L12:
            com.alibaba.fastjson.JSONPath$Segement[] r4 = r6.segments
            int r5 = r4.length
            if (r2 >= r5) goto L26
            int r5 = r4.length
            int r5 = r5 + (-1)
            if (r2 != r5) goto L1d
            r1 = r3
        L1d:
            r4 = r4[r2]
            java.lang.Object r3 = r4.eval(r6, r7, r3)
            int r2 = r2 + 1
            goto L12
        L26:
            if (r3 == 0) goto L99
            boolean r7 = r3 instanceof java.util.Collection
            if (r7 == 0) goto L39
            java.util.Collection r3 = (java.util.Collection) r3
            int r7 = r8.length
        L2f:
            if (r0 >= r7) goto Lb2
            r1 = r8[r0]
            r3.add(r1)
            int r0 = r0 + 1
            goto L2f
        L39:
            java.lang.Class r7 = r3.getClass()
            boolean r2 = r7.isArray()
            if (r2 == 0) goto L82
            int r2 = java.lang.reflect.Array.getLength(r3)
            java.lang.Class r7 = r7.getComponentType()
            int r4 = r8.length
            int r4 = r4 + r2
            java.lang.Object r7 = java.lang.reflect.Array.newInstance(r7, r4)
            java.lang.System.arraycopy(r3, r0, r7, r0, r2)
        L54:
            int r3 = r8.length
            if (r0 >= r3) goto L61
            int r3 = r2 + r0
            r4 = r8[r0]
            java.lang.reflect.Array.set(r7, r3, r4)
            int r0 = r0 + 1
            goto L54
        L61:
            com.alibaba.fastjson.JSONPath$Segement[] r8 = r6.segments
            int r0 = r8.length
            int r0 = r0 + (-1)
            r8 = r8[r0]
            boolean r0 = r8 instanceof com.alibaba.fastjson.JSONPath.PropertySegement
            if (r0 == 0) goto L72
            com.alibaba.fastjson.JSONPath$PropertySegement r8 = (com.alibaba.fastjson.JSONPath.PropertySegement) r8
            r8.setValue(r6, r1, r7)
            return
        L72:
            boolean r0 = r8 instanceof com.alibaba.fastjson.JSONPath.ArrayAccessSegement
            if (r0 == 0) goto L7c
            com.alibaba.fastjson.JSONPath$ArrayAccessSegement r8 = (com.alibaba.fastjson.JSONPath.ArrayAccessSegement) r8
            r8.setValue(r6, r1, r7)
            return
        L7c:
            java.lang.UnsupportedOperationException r7 = new java.lang.UnsupportedOperationException
            r7.<init>()
            throw r7
        L82:
            com.alibaba.fastjson.JSONException r8 = new com.alibaba.fastjson.JSONException
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "unsupported array put operation. "
            r0.append(r1)
            r0.append(r7)
            java.lang.String r7 = r0.toString()
            r8.<init>(r7)
            throw r8
        L99:
            com.alibaba.fastjson.JSONPathException r7 = new com.alibaba.fastjson.JSONPathException
            java.lang.StringBuilder r8 = new java.lang.StringBuilder
            r8.<init>()
            java.lang.String r0 = "value not found in path "
            r8.append(r0)
            java.lang.String r0 = r6.path
            r8.append(r0)
            java.lang.String r8 = r8.toString()
            r7.<init>(r8)
            throw r7
        Lb2:
            return
    }

    public boolean contains(java.lang.Object r6) {
            r5 = this;
            r0 = 0
            if (r6 != 0) goto L4
            return r0
        L4:
            r5.init()
            r2 = r6
            r1 = 0
        L9:
            com.alibaba.fastjson.JSONPath$Segement[] r3 = r5.segments
            int r4 = r3.length
            if (r1 >= r4) goto L1a
            r3 = r3[r1]
            java.lang.Object r2 = r3.eval(r5, r6, r2)
            if (r2 != 0) goto L17
            return r0
        L17:
            int r1 = r1 + 1
            goto L9
        L1a:
            r6 = 1
            return r6
    }

    public boolean containsValue(java.lang.Object r4, java.lang.Object r5) {
            r3 = this;
            java.lang.Object r4 = r3.eval(r4)
            r0 = 1
            if (r4 != r5) goto L8
            return r0
        L8:
            r1 = 0
            if (r4 != 0) goto Lc
            return r1
        Lc:
            boolean r2 = r4 instanceof java.lang.Iterable
            if (r2 == 0) goto L28
            java.lang.Iterable r4 = (java.lang.Iterable) r4
            java.util.Iterator r4 = r4.iterator()
        L16:
            boolean r2 = r4.hasNext()
            if (r2 == 0) goto L27
            java.lang.Object r2 = r4.next()
            boolean r2 = eq(r2, r5)
            if (r2 == 0) goto L16
            return r0
        L27:
            return r1
        L28:
            boolean r4 = eq(r4, r5)
            return r4
    }

    protected void deepScan(java.lang.Object r4, java.lang.String r5, java.util.List<java.lang.Object> r6) {
            r3 = this;
            java.lang.String r0 = "getFieldValue error."
            if (r4 != 0) goto L6
            goto Lc6
        L6:
            boolean r1 = r4 instanceof java.util.Map
            if (r1 == 0) goto L30
            java.util.Map r4 = (java.util.Map) r4
            boolean r0 = r4.containsKey(r5)
            if (r0 == 0) goto L1a
            java.lang.Object r4 = r4.get(r5)
            r6.add(r4)
            return
        L1a:
            java.util.Collection r4 = r4.values()
            java.util.Iterator r4 = r4.iterator()
        L22:
            boolean r0 = r4.hasNext()
            if (r0 == 0) goto Lc6
            java.lang.Object r0 = r4.next()
            r3.deepScan(r0, r5, r6)
            goto L22
        L30:
            java.lang.Class r1 = r4.getClass()
            com.alibaba.fastjson.serializer.JavaBeanSerializer r1 = r3.getJavaBeanSerializer(r1)
            if (r1 == 0) goto Laf
            com.alibaba.fastjson.serializer.FieldSerializer r2 = r1.getFieldSerializer(r5)     // Catch: java.lang.Exception -> L48
            if (r2 == 0) goto L78
            java.lang.Object r4 = r2.getPropertyValueDirect(r4)     // Catch: java.lang.Exception -> L48 java.lang.IllegalAccessException -> L4a java.lang.reflect.InvocationTargetException -> L4c
            r6.add(r4)     // Catch: java.lang.Exception -> L48 java.lang.IllegalAccessException -> L4a java.lang.reflect.InvocationTargetException -> L4c
            return
        L48:
            r4 = move-exception
            goto L8e
        L4a:
            r4 = move-exception
            goto L4e
        L4c:
            r4 = move-exception
            goto L63
        L4e:
            com.alibaba.fastjson.JSONException r6 = new com.alibaba.fastjson.JSONException     // Catch: java.lang.Exception -> L48
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch: java.lang.Exception -> L48
            r1.<init>()     // Catch: java.lang.Exception -> L48
            r1.append(r0)     // Catch: java.lang.Exception -> L48
            r1.append(r5)     // Catch: java.lang.Exception -> L48
            java.lang.String r0 = r1.toString()     // Catch: java.lang.Exception -> L48
            r6.<init>(r0, r4)     // Catch: java.lang.Exception -> L48
            throw r6     // Catch: java.lang.Exception -> L48
        L63:
            com.alibaba.fastjson.JSONException r6 = new com.alibaba.fastjson.JSONException     // Catch: java.lang.Exception -> L48
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch: java.lang.Exception -> L48
            r1.<init>()     // Catch: java.lang.Exception -> L48
            r1.append(r0)     // Catch: java.lang.Exception -> L48
            r1.append(r5)     // Catch: java.lang.Exception -> L48
            java.lang.String r0 = r1.toString()     // Catch: java.lang.Exception -> L48
            r6.<init>(r0, r4)     // Catch: java.lang.Exception -> L48
            throw r6     // Catch: java.lang.Exception -> L48
        L78:
            java.util.List r4 = r1.getFieldValues(r4)     // Catch: java.lang.Exception -> L48
            java.util.Iterator r4 = r4.iterator()     // Catch: java.lang.Exception -> L48
        L80:
            boolean r0 = r4.hasNext()     // Catch: java.lang.Exception -> L48
            if (r0 == 0) goto Lc6
            java.lang.Object r0 = r4.next()     // Catch: java.lang.Exception -> L48
            r3.deepScan(r0, r5, r6)     // Catch: java.lang.Exception -> L48
            goto L80
        L8e:
            com.alibaba.fastjson.JSONPathException r6 = new com.alibaba.fastjson.JSONPathException
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "jsonpath error, path "
            r0.append(r1)
            java.lang.String r1 = r3.path
            r0.append(r1)
            java.lang.String r1 = ", segement "
            r0.append(r1)
            r0.append(r5)
            java.lang.String r5 = r0.toString()
            r6.<init>(r5, r4)
            throw r6
        Laf:
            boolean r0 = r4 instanceof java.util.List
            if (r0 == 0) goto Lc6
            java.util.List r4 = (java.util.List) r4
            r0 = 0
        Lb6:
            int r1 = r4.size()
            if (r0 >= r1) goto Lc6
            java.lang.Object r1 = r4.get(r0)
            r3.deepScan(r1, r5, r6)
            int r0 = r0 + 1
            goto Lb6
        Lc6:
            return
    }

    protected void deepSet(java.lang.Object r3, java.lang.String r4, java.lang.Object r5) {
            r2 = this;
            if (r3 != 0) goto L4
            goto L95
        L4:
            boolean r0 = r3 instanceof java.util.Map
            if (r0 == 0) goto L2d
            java.util.Map r3 = (java.util.Map) r3
            boolean r0 = r3.containsKey(r4)
            if (r0 == 0) goto L17
            r3.get(r4)
            r3.put(r4, r5)
            return
        L17:
            java.util.Collection r3 = r3.values()
            java.util.Iterator r3 = r3.iterator()
        L1f:
            boolean r0 = r3.hasNext()
            if (r0 == 0) goto L95
            java.lang.Object r0 = r3.next()
            r2.deepSet(r0, r4, r5)
            goto L1f
        L2d:
            java.lang.Class r0 = r3.getClass()
            com.alibaba.fastjson.parser.deserializer.JavaBeanDeserializer r1 = r2.getJavaBeanDeserializer(r0)
            if (r1 == 0) goto L7e
            com.alibaba.fastjson.parser.deserializer.FieldDeserializer r1 = r1.getFieldDeserializer(r4)     // Catch: java.lang.Exception -> L41
            if (r1 == 0) goto L43
            r1.setValue(r3, r5)     // Catch: java.lang.Exception -> L41
            return
        L41:
            r3 = move-exception
            goto L5d
        L43:
            com.alibaba.fastjson.serializer.JavaBeanSerializer r0 = r2.getJavaBeanSerializer(r0)     // Catch: java.lang.Exception -> L41
            java.util.List r3 = r0.getObjectFieldValues(r3)     // Catch: java.lang.Exception -> L41
            java.util.Iterator r3 = r3.iterator()     // Catch: java.lang.Exception -> L41
        L4f:
            boolean r0 = r3.hasNext()     // Catch: java.lang.Exception -> L41
            if (r0 == 0) goto L95
            java.lang.Object r0 = r3.next()     // Catch: java.lang.Exception -> L41
            r2.deepSet(r0, r4, r5)     // Catch: java.lang.Exception -> L41
            goto L4f
        L5d:
            com.alibaba.fastjson.JSONPathException r5 = new com.alibaba.fastjson.JSONPathException
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "jsonpath error, path "
            r0.append(r1)
            java.lang.String r1 = r2.path
            r0.append(r1)
            java.lang.String r1 = ", segement "
            r0.append(r1)
            r0.append(r4)
            java.lang.String r4 = r0.toString()
            r5.<init>(r4, r3)
            throw r5
        L7e:
            boolean r0 = r3 instanceof java.util.List
            if (r0 == 0) goto L95
            java.util.List r3 = (java.util.List) r3
            r0 = 0
        L85:
            int r1 = r3.size()
            if (r0 >= r1) goto L95
            java.lang.Object r1 = r3.get(r0)
            r2.deepSet(r1, r4, r5)
            int r0 = r0 + 1
            goto L85
        L95:
            return
    }

    public java.lang.Object eval(java.lang.Object r5) {
            r4 = this;
            if (r5 != 0) goto L4
            r5 = 0
            return r5
        L4:
            r4.init()
            r0 = 0
            r1 = r5
        L9:
            com.alibaba.fastjson.JSONPath$Segement[] r2 = r4.segments
            int r3 = r2.length
            if (r0 >= r3) goto L17
            r2 = r2[r0]
            java.lang.Object r1 = r2.eval(r4, r5, r1)
            int r0 = r0 + 1
            goto L9
        L17:
            return r1
    }

    int evalSize(java.lang.Object r4) {
            r3 = this;
            r0 = -1
            if (r4 != 0) goto L4
            return r0
        L4:
            boolean r1 = r4 instanceof java.util.Collection
            if (r1 == 0) goto Lf
            java.util.Collection r4 = (java.util.Collection) r4
            int r4 = r4.size()
            return r4
        Lf:
            boolean r1 = r4 instanceof java.lang.Object[]
            if (r1 == 0) goto L17
            java.lang.Object[] r4 = (java.lang.Object[]) r4
            int r4 = r4.length
            return r4
        L17:
            java.lang.Class r1 = r4.getClass()
            boolean r1 = r1.isArray()
            if (r1 == 0) goto L26
            int r4 = java.lang.reflect.Array.getLength(r4)
            return r4
        L26:
            boolean r1 = r4 instanceof java.util.Map
            if (r1 == 0) goto L45
            java.util.Map r4 = (java.util.Map) r4
            java.util.Collection r4 = r4.values()
            java.util.Iterator r4 = r4.iterator()
            r0 = 0
        L35:
            boolean r1 = r4.hasNext()
            if (r1 == 0) goto L44
            java.lang.Object r1 = r4.next()
            if (r1 == 0) goto L35
            int r0 = r0 + 1
            goto L35
        L44:
            return r0
        L45:
            java.lang.Class r1 = r4.getClass()
            com.alibaba.fastjson.serializer.JavaBeanSerializer r1 = r3.getJavaBeanSerializer(r1)
            if (r1 != 0) goto L50
            return r0
        L50:
            int r4 = r1.getSize(r4)     // Catch: java.lang.Exception -> L55
            return r4
        L55:
            r4 = move-exception
            com.alibaba.fastjson.JSONPathException r0 = new com.alibaba.fastjson.JSONPathException
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "evalSize error : "
            r1.append(r2)
            java.lang.String r2 = r3.path
            r1.append(r2)
            java.lang.String r1 = r1.toString()
            r0.<init>(r1, r4)
            throw r0
    }

    protected java.lang.Object getArrayItem(java.lang.Object r4, int r5) {
            r3 = this;
            r0 = 0
            if (r4 != 0) goto L4
            return r0
        L4:
            boolean r1 = r4 instanceof java.util.List
            if (r1 == 0) goto L2d
            java.util.List r4 = (java.util.List) r4
            if (r5 < 0) goto L18
            int r1 = r4.size()
            if (r5 >= r1) goto L17
            java.lang.Object r4 = r4.get(r5)
            return r4
        L17:
            return r0
        L18:
            int r1 = java.lang.Math.abs(r5)
            int r2 = r4.size()
            if (r1 > r2) goto L2c
            int r0 = r4.size()
            int r0 = r0 + r5
            java.lang.Object r4 = r4.get(r0)
            return r4
        L2c:
            return r0
        L2d:
            java.lang.Class r1 = r4.getClass()
            boolean r1 = r1.isArray()
            if (r1 == 0) goto L52
            int r1 = java.lang.reflect.Array.getLength(r4)
            if (r5 < 0) goto L45
            if (r5 >= r1) goto L44
            java.lang.Object r4 = java.lang.reflect.Array.get(r4, r5)
            return r4
        L44:
            return r0
        L45:
            int r2 = java.lang.Math.abs(r5)
            if (r2 > r1) goto L51
            int r1 = r1 + r5
            java.lang.Object r4 = java.lang.reflect.Array.get(r4, r1)
            return r4
        L51:
            return r0
        L52:
            boolean r0 = r4 instanceof java.util.Map
            if (r0 == 0) goto L6c
            java.util.Map r4 = (java.util.Map) r4
            java.lang.Integer r0 = java.lang.Integer.valueOf(r5)
            java.lang.Object r0 = r4.get(r0)
            if (r0 != 0) goto L6b
            java.lang.String r5 = java.lang.Integer.toString(r5)
            java.lang.Object r4 = r4.get(r5)
            return r4
        L6b:
            return r0
        L6c:
            java.lang.UnsupportedOperationException r4 = new java.lang.UnsupportedOperationException
            r4.<init>()
            throw r4
    }

    protected com.alibaba.fastjson.parser.deserializer.JavaBeanDeserializer getJavaBeanDeserializer(java.lang.Class<?> r2) {
            r1 = this;
            com.alibaba.fastjson.parser.ParserConfig r0 = r1.parserConfig
            com.alibaba.fastjson.parser.deserializer.ObjectDeserializer r2 = r0.getDeserializer(r2)
            boolean r0 = r2 instanceof com.alibaba.fastjson.parser.deserializer.JavaBeanDeserializer
            if (r0 == 0) goto Ld
            com.alibaba.fastjson.parser.deserializer.JavaBeanDeserializer r2 = (com.alibaba.fastjson.parser.deserializer.JavaBeanDeserializer) r2
            return r2
        Ld:
            r2 = 0
            return r2
    }

    protected com.alibaba.fastjson.serializer.JavaBeanSerializer getJavaBeanSerializer(java.lang.Class<?> r2) {
            r1 = this;
            com.alibaba.fastjson.serializer.SerializeConfig r0 = r1.serializeConfig
            com.alibaba.fastjson.serializer.ObjectSerializer r2 = r0.getObjectWriter(r2)
            boolean r0 = r2 instanceof com.alibaba.fastjson.serializer.JavaBeanSerializer
            if (r0 == 0) goto Ld
            com.alibaba.fastjson.serializer.JavaBeanSerializer r2 = (com.alibaba.fastjson.serializer.JavaBeanSerializer) r2
            return r2
        Ld:
            r2 = 0
            return r2
    }

    public java.lang.String getPath() {
            r1 = this;
            java.lang.String r0 = r1.path
            return r0
    }

    protected java.lang.Object getPropertyValue(java.lang.Object r5, java.lang.String r6, boolean r7) {
            r4 = this;
            if (r5 != 0) goto L4
            r5 = 0
            return r5
        L4:
            boolean r0 = r5 instanceof java.util.Map
            java.lang.String r1 = "size"
            if (r0 == 0) goto L22
            java.util.Map r5 = (java.util.Map) r5
            java.lang.Object r7 = r5.get(r6)
            if (r7 != 0) goto L21
            boolean r6 = r1.equals(r6)
            if (r6 == 0) goto L21
            int r5 = r5.size()
            java.lang.Integer r5 = java.lang.Integer.valueOf(r5)
            return r5
        L21:
            return r7
        L22:
            java.lang.Class r0 = r5.getClass()
            com.alibaba.fastjson.serializer.JavaBeanSerializer r0 = r4.getJavaBeanSerializer(r0)
            java.lang.String r2 = ", segement "
            java.lang.String r3 = "jsonpath error, path "
            if (r0 == 0) goto L53
            java.lang.Object r5 = r0.getFieldValue(r5, r6)     // Catch: java.lang.Exception -> L35
            return r5
        L35:
            r5 = move-exception
            com.alibaba.fastjson.JSONPathException r7 = new com.alibaba.fastjson.JSONPathException
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            r0.append(r3)
            java.lang.String r1 = r4.path
            r0.append(r1)
            r0.append(r2)
            r0.append(r6)
            java.lang.String r6 = r0.toString()
            r7.<init>(r6, r5)
            throw r7
        L53:
            boolean r0 = r5 instanceof java.util.List
            if (r0 == 0) goto L91
            java.util.List r5 = (java.util.List) r5
            boolean r0 = r1.equals(r6)
            if (r0 == 0) goto L68
            int r5 = r5.size()
            java.lang.Integer r5 = java.lang.Integer.valueOf(r5)
            return r5
        L68:
            com.alibaba.fastjson.JSONArray r0 = new com.alibaba.fastjson.JSONArray
            int r1 = r5.size()
            r0.<init>(r1)
            r1 = 0
        L72:
            int r2 = r5.size()
            if (r1 >= r2) goto L90
            java.lang.Object r2 = r5.get(r1)
            java.lang.Object r2 = r4.getPropertyValue(r2, r6, r7)
            boolean r3 = r2 instanceof java.util.Collection
            if (r3 == 0) goto L8a
            java.util.Collection r2 = (java.util.Collection) r2
            r0.addAll(r2)
            goto L8d
        L8a:
            r0.add(r2)
        L8d:
            int r1 = r1 + 1
            goto L72
        L90:
            return r0
        L91:
            boolean r7 = r5 instanceof java.lang.Enum
            if (r7 == 0) goto Lb6
            r7 = r5
            java.lang.Enum r7 = (java.lang.Enum) r7
            java.lang.String r0 = "name"
            boolean r0 = r0.equals(r6)
            if (r0 == 0) goto La5
            java.lang.String r5 = r7.name()
            return r5
        La5:
            java.lang.String r0 = "ordinal"
            boolean r0 = r0.equals(r6)
            if (r0 == 0) goto Lb6
            int r5 = r7.ordinal()
            java.lang.Integer r5 = java.lang.Integer.valueOf(r5)
            return r5
        Lb6:
            boolean r7 = r5 instanceof java.util.Calendar
            if (r7 == 0) goto L12b
            java.util.Calendar r5 = (java.util.Calendar) r5
            java.lang.String r7 = "year"
            boolean r7 = r7.equals(r6)
            if (r7 == 0) goto Lce
            r6 = 1
            int r5 = r5.get(r6)
            java.lang.Integer r5 = java.lang.Integer.valueOf(r5)
            return r5
        Lce:
            java.lang.String r7 = "month"
            boolean r7 = r7.equals(r6)
            if (r7 == 0) goto Le0
            r6 = 2
            int r5 = r5.get(r6)
            java.lang.Integer r5 = java.lang.Integer.valueOf(r5)
            return r5
        Le0:
            java.lang.String r7 = "day"
            boolean r7 = r7.equals(r6)
            if (r7 == 0) goto Lf2
            r6 = 5
            int r5 = r5.get(r6)
            java.lang.Integer r5 = java.lang.Integer.valueOf(r5)
            return r5
        Lf2:
            java.lang.String r7 = "hour"
            boolean r7 = r7.equals(r6)
            if (r7 == 0) goto L105
            r6 = 11
            int r5 = r5.get(r6)
            java.lang.Integer r5 = java.lang.Integer.valueOf(r5)
            return r5
        L105:
            java.lang.String r7 = "minute"
            boolean r7 = r7.equals(r6)
            if (r7 == 0) goto L118
            r6 = 12
            int r5 = r5.get(r6)
            java.lang.Integer r5 = java.lang.Integer.valueOf(r5)
            return r5
        L118:
            java.lang.String r7 = "second"
            boolean r7 = r7.equals(r6)
            if (r7 == 0) goto L12b
            r6 = 13
            int r5 = r5.get(r6)
            java.lang.Integer r5 = java.lang.Integer.valueOf(r5)
            return r5
        L12b:
            com.alibaba.fastjson.JSONPathException r5 = new com.alibaba.fastjson.JSONPathException
            java.lang.StringBuilder r7 = new java.lang.StringBuilder
            r7.<init>()
            r7.append(r3)
            java.lang.String r0 = r4.path
            r7.append(r0)
            r7.append(r2)
            r7.append(r6)
            java.lang.String r6 = r7.toString()
            r5.<init>(r6)
            throw r5
    }

    protected java.util.Collection<java.lang.Object> getPropertyValues(java.lang.Object r4) {
            r3 = this;
            java.lang.Class r0 = r4.getClass()
            com.alibaba.fastjson.serializer.JavaBeanSerializer r0 = r3.getJavaBeanSerializer(r0)
            if (r0 == 0) goto L29
            java.util.List r4 = r0.getFieldValues(r4)     // Catch: java.lang.Exception -> Lf
            return r4
        Lf:
            r4 = move-exception
            com.alibaba.fastjson.JSONPathException r0 = new com.alibaba.fastjson.JSONPathException
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "jsonpath error, path "
            r1.append(r2)
            java.lang.String r2 = r3.path
            r1.append(r2)
            java.lang.String r1 = r1.toString()
            r0.<init>(r1, r4)
            throw r0
        L29:
            boolean r0 = r4 instanceof java.util.Map
            if (r0 == 0) goto L34
            java.util.Map r4 = (java.util.Map) r4
            java.util.Collection r4 = r4.values()
            return r4
        L34:
            java.lang.UnsupportedOperationException r4 = new java.lang.UnsupportedOperationException
            r4.<init>()
            throw r4
    }

    protected void init() {
            r3 = this;
            com.alibaba.fastjson.JSONPath$Segement[] r0 = r3.segments
            if (r0 == 0) goto L5
            return
        L5:
            java.lang.String r0 = "*"
            java.lang.String r1 = r3.path
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L1a
            r0 = 1
            com.alibaba.fastjson.JSONPath$Segement[] r0 = new com.alibaba.fastjson.JSONPath.Segement[r0]
            com.alibaba.fastjson.JSONPath$WildCardSegement r1 = com.alibaba.fastjson.JSONPath.WildCardSegement.instance
            r2 = 0
            r0[r2] = r1
            r3.segments = r0
            return
        L1a:
            com.alibaba.fastjson.JSONPath$JSONPathParser r0 = new com.alibaba.fastjson.JSONPath$JSONPathParser
            java.lang.String r1 = r3.path
            r0.<init>(r1)
            com.alibaba.fastjson.JSONPath$Segement[] r0 = r0.explain()
            r3.segments = r0
            return
    }

    public boolean remove(java.lang.Object r7) {
            r6 = this;
            r0 = 0
            if (r7 != 0) goto L4
            return r0
        L4:
            r6.init()
            r2 = r7
            r1 = 0
        L9:
            com.alibaba.fastjson.JSONPath$Segement[] r3 = r6.segments
            int r4 = r3.length
            r5 = 1
            if (r1 >= r4) goto L20
            int r4 = r3.length
            int r4 = r4 - r5
            if (r1 != r4) goto L14
            goto L21
        L14:
            r3 = r3[r1]
            java.lang.Object r2 = r3.eval(r6, r7, r2)
            if (r2 != 0) goto L1d
            goto L20
        L1d:
            int r1 = r1 + 1
            goto L9
        L20:
            r2 = 0
        L21:
            if (r2 != 0) goto L24
            return r0
        L24:
            com.alibaba.fastjson.JSONPath$Segement[] r7 = r6.segments
            int r1 = r7.length
            int r1 = r1 - r5
            r1 = r7[r1]
            boolean r3 = r1 instanceof com.alibaba.fastjson.JSONPath.PropertySegement
            if (r3 == 0) goto L62
            com.alibaba.fastjson.JSONPath$PropertySegement r1 = (com.alibaba.fastjson.JSONPath.PropertySegement) r1
            boolean r3 = r2 instanceof java.util.Collection
            if (r3 == 0) goto L5d
            int r3 = r7.length
            if (r3 <= r5) goto L5d
            int r3 = r7.length
            int r3 = r3 + (-2)
            r7 = r7[r3]
            boolean r3 = r7 instanceof com.alibaba.fastjson.JSONPath.RangeSegement
            if (r3 != 0) goto L44
            boolean r7 = r7 instanceof com.alibaba.fastjson.JSONPath.MultiIndexSegement
            if (r7 == 0) goto L5d
        L44:
            java.util.Collection r2 = (java.util.Collection) r2
            java.util.Iterator r7 = r2.iterator()
        L4a:
            boolean r2 = r7.hasNext()
            if (r2 == 0) goto L5c
            java.lang.Object r2 = r7.next()
            boolean r2 = r1.remove(r6, r2)
            if (r2 == 0) goto L4a
            r0 = 1
            goto L4a
        L5c:
            return r0
        L5d:
            boolean r7 = r1.remove(r6, r2)
            return r7
        L62:
            boolean r7 = r1 instanceof com.alibaba.fastjson.JSONPath.ArrayAccessSegement
            if (r7 == 0) goto L6d
            com.alibaba.fastjson.JSONPath$ArrayAccessSegement r1 = (com.alibaba.fastjson.JSONPath.ArrayAccessSegement) r1
            boolean r7 = r1.remove(r6, r2)
            return r7
        L6d:
            java.lang.UnsupportedOperationException r7 = new java.lang.UnsupportedOperationException
            r7.<init>()
            throw r7
    }

    public boolean removeArrayItem(com.alibaba.fastjson.JSONPath r2, java.lang.Object r3, int r4) {
            r1 = this;
            boolean r2 = r3 instanceof java.util.List
            if (r2 == 0) goto L21
            java.util.List r3 = (java.util.List) r3
            r2 = 0
            if (r4 < 0) goto L14
            int r0 = r3.size()
            if (r4 < r0) goto L10
            return r2
        L10:
            r3.remove(r4)
            goto L1f
        L14:
            int r0 = r3.size()
            int r0 = r0 + r4
            if (r0 >= 0) goto L1c
            return r2
        L1c:
            r3.remove(r0)
        L1f:
            r2 = 1
            return r2
        L21:
            java.lang.Class r2 = r3.getClass()
            com.alibaba.fastjson.JSONPathException r3 = new com.alibaba.fastjson.JSONPathException
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>()
            java.lang.String r0 = "unsupported set operation."
            r4.append(r0)
            r4.append(r2)
            java.lang.String r2 = r4.toString()
            r3.<init>(r2)
            throw r3
    }

    protected boolean removePropertyValue(java.lang.Object r6, java.lang.String r7) {
            r5 = this;
            boolean r0 = r6 instanceof java.util.Map
            r1 = 0
            r2 = 1
            if (r0 == 0) goto L10
            java.util.Map r6 = (java.util.Map) r6
            java.lang.Object r6 = r6.remove(r7)
            if (r6 == 0) goto Lf
            return r2
        Lf:
            return r1
        L10:
            com.alibaba.fastjson.parser.ParserConfig r0 = r5.parserConfig
            java.lang.Class r3 = r6.getClass()
            com.alibaba.fastjson.parser.deserializer.ObjectDeserializer r0 = r0.getDeserializer(r3)
            boolean r3 = r0 instanceof com.alibaba.fastjson.parser.deserializer.JavaBeanDeserializer
            r4 = 0
            if (r3 == 0) goto L22
            com.alibaba.fastjson.parser.deserializer.JavaBeanDeserializer r0 = (com.alibaba.fastjson.parser.deserializer.JavaBeanDeserializer) r0
            goto L23
        L22:
            r0 = r4
        L23:
            if (r0 == 0) goto L30
            com.alibaba.fastjson.parser.deserializer.FieldDeserializer r7 = r0.getFieldDeserializer(r7)
            if (r7 != 0) goto L2c
            return r1
        L2c:
            r7.setValue(r6, r4)
            return r2
        L30:
            java.lang.UnsupportedOperationException r6 = new java.lang.UnsupportedOperationException
            r6.<init>()
            throw r6
    }

    public boolean set(java.lang.Object r2, java.lang.Object r3) {
            r1 = this;
            r0 = 1
            boolean r2 = r1.set(r2, r3, r0)
            return r2
    }

    public boolean set(java.lang.Object r9, java.lang.Object r10, boolean r11) {
            r8 = this;
            r11 = 0
            if (r9 != 0) goto L4
            return r11
        L4:
            r8.init()
            r0 = 0
            r2 = r9
            r3 = r0
            r1 = 0
        Lb:
            com.alibaba.fastjson.JSONPath$Segement[] r4 = r8.segments
            int r5 = r4.length
            r6 = 1
            if (r1 >= r5) goto L86
            r3 = r4[r1]
            java.lang.Object r4 = r3.eval(r8, r9, r2)
            if (r4 != 0) goto L81
            com.alibaba.fastjson.JSONPath$Segement[] r4 = r8.segments
            int r5 = r4.length
            int r5 = r5 - r6
            if (r1 >= r5) goto L24
            int r5 = r1 + 1
            r4 = r4[r5]
            goto L25
        L24:
            r4 = r0
        L25:
            boolean r5 = r4 instanceof com.alibaba.fastjson.JSONPath.PropertySegement
            if (r5 == 0) goto L61
            boolean r4 = r3 instanceof com.alibaba.fastjson.JSONPath.PropertySegement
            if (r4 == 0) goto L4b
            r4 = r3
            com.alibaba.fastjson.JSONPath$PropertySegement r4 = (com.alibaba.fastjson.JSONPath.PropertySegement) r4
            java.lang.String r4 = com.alibaba.fastjson.JSONPath.PropertySegement.access$000(r4)
            java.lang.Class r5 = r2.getClass()
            com.alibaba.fastjson.parser.deserializer.JavaBeanDeserializer r5 = r8.getJavaBeanDeserializer(r5)
            if (r5 == 0) goto L4b
            com.alibaba.fastjson.parser.deserializer.FieldDeserializer r4 = r5.getFieldDeserializer(r4)
            com.alibaba.fastjson.util.FieldInfo r4 = r4.fieldInfo
            java.lang.Class<?> r4 = r4.fieldClass
            com.alibaba.fastjson.parser.deserializer.JavaBeanDeserializer r5 = r8.getJavaBeanDeserializer(r4)
            goto L4d
        L4b:
            r4 = r0
            r5 = r4
        L4d:
            if (r5 == 0) goto L5b
            com.alibaba.fastjson.util.JavaBeanInfo r7 = r5.beanInfo
            java.lang.reflect.Constructor<?> r7 = r7.defaultConstructor
            if (r7 == 0) goto L5a
            java.lang.Object r4 = r5.createInstance(r0, r4)
            goto L6c
        L5a:
            return r11
        L5b:
            com.alibaba.fastjson.JSONObject r4 = new com.alibaba.fastjson.JSONObject
            r4.<init>()
            goto L6c
        L61:
            boolean r4 = r4 instanceof com.alibaba.fastjson.JSONPath.ArrayAccessSegement
            if (r4 == 0) goto L6b
            com.alibaba.fastjson.JSONArray r4 = new com.alibaba.fastjson.JSONArray
            r4.<init>()
            goto L6c
        L6b:
            r4 = r0
        L6c:
            if (r4 == 0) goto L87
            boolean r5 = r3 instanceof com.alibaba.fastjson.JSONPath.PropertySegement
            if (r5 == 0) goto L78
            com.alibaba.fastjson.JSONPath$PropertySegement r3 = (com.alibaba.fastjson.JSONPath.PropertySegement) r3
            r3.setValue(r8, r2, r4)
            goto L81
        L78:
            boolean r5 = r3 instanceof com.alibaba.fastjson.JSONPath.ArrayAccessSegement
            if (r5 == 0) goto L87
            com.alibaba.fastjson.JSONPath$ArrayAccessSegement r3 = (com.alibaba.fastjson.JSONPath.ArrayAccessSegement) r3
            r3.setValue(r8, r2, r4)
        L81:
            int r1 = r1 + 1
            r3 = r2
            r2 = r4
            goto Lb
        L86:
            r2 = r3
        L87:
            if (r2 != 0) goto L8a
            return r11
        L8a:
            com.alibaba.fastjson.JSONPath$Segement[] r9 = r8.segments
            int r11 = r9.length
            int r11 = r11 - r6
            r9 = r9[r11]
            boolean r11 = r9 instanceof com.alibaba.fastjson.JSONPath.PropertySegement
            if (r11 == 0) goto L9a
            com.alibaba.fastjson.JSONPath$PropertySegement r9 = (com.alibaba.fastjson.JSONPath.PropertySegement) r9
            r9.setValue(r8, r2, r10)
            return r6
        L9a:
            boolean r11 = r9 instanceof com.alibaba.fastjson.JSONPath.ArrayAccessSegement
            if (r11 == 0) goto La5
            com.alibaba.fastjson.JSONPath$ArrayAccessSegement r9 = (com.alibaba.fastjson.JSONPath.ArrayAccessSegement) r9
            boolean r9 = r9.setValue(r8, r2, r10)
            return r9
        La5:
            java.lang.UnsupportedOperationException r9 = new java.lang.UnsupportedOperationException
            r9.<init>()
            throw r9
    }

    public boolean setArrayItem(com.alibaba.fastjson.JSONPath r3, java.lang.Object r4, int r5, java.lang.Object r6) {
            r2 = this;
            boolean r3 = r4 instanceof java.util.List
            r0 = 1
            if (r3 == 0) goto L16
            java.util.List r4 = (java.util.List) r4
            if (r5 < 0) goto Ld
            r4.set(r5, r6)
            goto L15
        Ld:
            int r3 = r4.size()
            int r3 = r3 + r5
            r4.set(r3, r6)
        L15:
            return r0
        L16:
            java.lang.Class r3 = r4.getClass()
            boolean r1 = r3.isArray()
            if (r1 == 0) goto L37
            int r3 = java.lang.reflect.Array.getLength(r4)
            if (r5 < 0) goto L2c
            if (r5 >= r3) goto L36
            java.lang.reflect.Array.set(r4, r5, r6)
            goto L36
        L2c:
            int r1 = java.lang.Math.abs(r5)
            if (r1 > r3) goto L36
            int r3 = r3 + r5
            java.lang.reflect.Array.set(r4, r3, r6)
        L36:
            return r0
        L37:
            com.alibaba.fastjson.JSONPathException r4 = new com.alibaba.fastjson.JSONPathException
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            r5.<init>()
            java.lang.String r6 = "unsupported set operation."
            r5.append(r6)
            r5.append(r3)
            java.lang.String r3 = r5.toString()
            r4.<init>(r3)
            throw r4
    }

    protected boolean setPropertyValue(java.lang.Object r4, java.lang.String r5, java.lang.Object r6) {
            r3 = this;
            boolean r0 = r4 instanceof java.util.Map
            r1 = 1
            if (r0 == 0) goto Lb
            java.util.Map r4 = (java.util.Map) r4
            r4.put(r5, r6)
            return r1
        Lb:
            boolean r0 = r4 instanceof java.util.List
            if (r0 == 0) goto L27
            java.util.List r4 = (java.util.List) r4
            java.util.Iterator r4 = r4.iterator()
        L15:
            boolean r0 = r4.hasNext()
            if (r0 == 0) goto L26
            java.lang.Object r0 = r4.next()
            if (r0 != 0) goto L22
            goto L15
        L22:
            r3.setPropertyValue(r0, r5, r6)
            goto L15
        L26:
            return r1
        L27:
            com.alibaba.fastjson.parser.ParserConfig r0 = r3.parserConfig
            java.lang.Class r2 = r4.getClass()
            com.alibaba.fastjson.parser.deserializer.ObjectDeserializer r0 = r0.getDeserializer(r2)
            boolean r2 = r0 instanceof com.alibaba.fastjson.parser.deserializer.JavaBeanDeserializer
            if (r2 == 0) goto L38
            com.alibaba.fastjson.parser.deserializer.JavaBeanDeserializer r0 = (com.alibaba.fastjson.parser.deserializer.JavaBeanDeserializer) r0
            goto L39
        L38:
            r0 = 0
        L39:
            if (r0 == 0) goto L47
            com.alibaba.fastjson.parser.deserializer.FieldDeserializer r5 = r0.getFieldDeserializer(r5)
            if (r5 != 0) goto L43
            r4 = 0
            return r4
        L43:
            r5.setValue(r4, r6)
            return r1
        L47:
            java.lang.UnsupportedOperationException r4 = new java.lang.UnsupportedOperationException
            r4.<init>()
            throw r4
    }

    public int size(java.lang.Object r5) {
            r4 = this;
            if (r5 != 0) goto L4
            r5 = -1
            return r5
        L4:
            r4.init()
            r0 = 0
            r1 = r5
        L9:
            com.alibaba.fastjson.JSONPath$Segement[] r2 = r4.segments
            int r3 = r2.length
            if (r0 >= r3) goto L17
            r2 = r2[r0]
            java.lang.Object r1 = r2.eval(r4, r5, r1)
            int r0 = r0 + 1
            goto L9
        L17:
            int r5 = r4.evalSize(r1)
            return r5
    }

    @Override // com.alibaba.fastjson.JSONAware
    public java.lang.String toJSONString() {
            r1 = this;
            java.lang.String r0 = r1.path
            java.lang.String r0 = com.alibaba.fastjson.JSON.toJSONString(r0)
            return r0
    }
}
