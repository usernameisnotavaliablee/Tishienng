package cn.bluemobi.dylan.http;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Volumes/前任肥胖/下载/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_8_sz9482380.dex */
public class JsonParse implements cn.bluemobi.dylan.http.HttpJsonKey {
    private static volatile cn.bluemobi.dylan.http.JsonParse jsonParse;
    private java.lang.String code;
    private java.lang.String data;
    private java.lang.String msg;
    private int successCode;





    static {
            return
    }

    private JsonParse() {
            r1 = this;
            r1.<init>()
            java.lang.String r0 = "code"
            r1.code = r0
            java.lang.String r0 = "msg"
            r1.msg = r0
            java.lang.String r0 = "data"
            r1.data = r0
            r0 = -1
            r1.successCode = r0
            return
    }

    private static void addIndentBlank(java.lang.StringBuilder r2, int r3) {
            r0 = 0
        L1:
            if (r0 >= r3) goto Lb
            r1 = 9
            r2.append(r1)
            int r0 = r0 + 1
            goto L1
        Lb:
            return
    }

    public static java.lang.String formatJson(java.lang.String r7) {
            java.lang.String r0 = ""
            if (r7 == 0) goto L65
            boolean r1 = r0.equals(r7)
            if (r1 == 0) goto Lb
            goto L65
        Lb:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            r1 = 0
            r2 = 0
            r3 = 0
        L13:
            int r4 = r7.length()
            if (r1 >= r4) goto L60
            char r4 = r7.charAt(r1)
            r5 = 44
            r6 = 10
            if (r4 == r5) goto L4f
            r2 = 91
            if (r4 == r2) goto L43
            r2 = 93
            if (r4 == r2) goto L37
            r2 = 123(0x7b, float:1.72E-43)
            if (r4 == r2) goto L43
            r2 = 125(0x7d, float:1.75E-43)
            if (r4 == r2) goto L37
            r0.append(r4)
            goto L5c
        L37:
            r0.append(r6)
            int r3 = r3 + (-1)
            addIndentBlank(r0, r3)
            r0.append(r4)
            goto L5c
        L43:
            r0.append(r4)
            r0.append(r6)
            int r3 = r3 + 1
            addIndentBlank(r0, r3)
            goto L5c
        L4f:
            r0.append(r4)
            r5 = 92
            if (r2 == r5) goto L5c
            r0.append(r6)
            addIndentBlank(r0, r3)
        L5c:
            int r1 = r1 + 1
            r2 = r4
            goto L13
        L60:
            java.lang.String r7 = r0.toString()
            return r7
        L65:
            return r0
    }

    public static java.lang.String formatMoney(double r2) {
            java.text.DecimalFormat r0 = new java.text.DecimalFormat
            java.lang.String r1 = "0.00"
            r0.<init>(r1)
            java.lang.String r2 = r0.format(r2)
            return r2
    }

    public static boolean getBoolean(java.util.Map<java.lang.String, java.lang.Object> r1, java.lang.String r2) {
            r0 = 0
            boolean r1 = getBoolean(r1, r2, r0)
            return r1
    }

    public static boolean getBoolean(java.util.Map<java.lang.String, java.lang.Object> r0, java.lang.String r1, boolean r2) {
            java.lang.String r0 = getString(r0, r1)     // Catch: java.lang.Throwable -> L9
            boolean r0 = java.lang.Boolean.parseBoolean(r0)     // Catch: java.lang.Throwable -> L9
            return r0
        L9:
            return r2
    }

    public static double getDouble(java.util.Map<java.lang.String, java.lang.Object> r2, java.lang.String r3) {
            r0 = 0
            double r2 = getDouble(r2, r3, r0)
            return r2
    }

    public static double getDouble(java.util.Map<java.lang.String, java.lang.Object> r0, java.lang.String r1, double r2) {
            r2 = 0
            java.lang.String r0 = getString(r0, r1)     // Catch: java.lang.Throwable -> Lb
            double r0 = java.lang.Double.parseDouble(r0)     // Catch: java.lang.Throwable -> Lb
            return r0
        Lb:
            return r2
    }

    public static float getFloat(java.util.Map<java.lang.String, java.lang.Object> r1, java.lang.String r2) {
            r0 = 0
            float r1 = getFloat(r1, r2, r0)
            return r1
    }

    public static float getFloat(java.util.Map<java.lang.String, java.lang.Object> r0, java.lang.String r1, float r2) {
            r2 = 0
            java.lang.String r0 = getString(r0, r1)     // Catch: java.lang.Throwable -> La
            float r0 = java.lang.Float.parseFloat(r0)     // Catch: java.lang.Throwable -> La
            return r0
        La:
            return r2
    }

    public static int getInt(java.util.Map<java.lang.String, java.lang.Object> r1, java.lang.String r2) {
            r0 = 0
            int r1 = getInt(r1, r2, r0)
            return r1
    }

    public static int getInt(java.util.Map<java.lang.String, java.lang.Object> r0, java.lang.String r1, int r2) {
            java.lang.String r0 = getString(r0, r1)     // Catch: java.lang.Throwable -> L9
            int r0 = java.lang.Integer.parseInt(r0)     // Catch: java.lang.Throwable -> L9
            return r0
        L9:
            return r2
    }

    public static cn.bluemobi.dylan.http.JsonParse getJsonParse() {
            cn.bluemobi.dylan.http.JsonParse r0 = cn.bluemobi.dylan.http.JsonParse.jsonParse
            if (r0 != 0) goto L19
            java.lang.Class<cn.bluemobi.dylan.http.Http> r0 = cn.bluemobi.dylan.http.Http.class
            monitor-enter(r0)
            cn.bluemobi.dylan.http.JsonParse r1 = cn.bluemobi.dylan.http.JsonParse.jsonParse     // Catch: java.lang.Throwable -> L13
            if (r1 != 0) goto L15
            cn.bluemobi.dylan.http.JsonParse r1 = new cn.bluemobi.dylan.http.JsonParse     // Catch: java.lang.Throwable -> L13
            r1.<init>()     // Catch: java.lang.Throwable -> L13
            cn.bluemobi.dylan.http.JsonParse.jsonParse = r1     // Catch: java.lang.Throwable -> L13
            goto L15
        L13:
            r1 = move-exception
            goto L17
        L15:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L13
            goto L19
        L17:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L13
            throw r1
        L19:
            cn.bluemobi.dylan.http.JsonParse r0 = cn.bluemobi.dylan.http.JsonParse.jsonParse
            return r0
    }

    public static java.util.List<java.util.Map<java.lang.String, java.lang.Object>> getList(java.util.Map<java.lang.String, java.lang.Object> r2, java.lang.String r3) {
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            if (r2 == 0) goto L29
            int r1 = r2.size()
            if (r1 != 0) goto Le
            goto L29
        Le:
            boolean r1 = isNull(r3)
            if (r1 == 0) goto L15
            goto L29
        L15:
            boolean r1 = r2.containsKey(r3)
            if (r1 == 0) goto L29
            java.lang.Object r2 = r2.get(r3)
            if (r2 != 0) goto L22
            goto L29
        L22:
            boolean r3 = r2 instanceof java.util.List
            if (r3 == 0) goto L29
            java.util.List r2 = (java.util.List) r2
            return r2
        L29:
            return r0
    }

    public static <T> java.util.List<T> getList(java.util.Map<java.lang.String, java.lang.Object> r2, java.lang.String r3, java.lang.Class<T> r4) {
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            if (r2 == 0) goto L2f
            int r1 = r2.size()
            if (r1 != 0) goto Le
            goto L2f
        Le:
            boolean r1 = isNull(r3)
            if (r1 == 0) goto L15
            goto L2f
        L15:
            boolean r1 = r2.containsKey(r3)
            if (r1 == 0) goto L2f
            java.lang.Object r2 = r2.get(r3)
            if (r2 != 0) goto L22
            goto L2f
        L22:
            boolean r3 = r2 instanceof java.util.List
            if (r3 == 0) goto L2f
            java.lang.String r2 = com.alibaba.fastjson.JSON.toJSONString(r2)
            java.util.List r2 = com.alibaba.fastjson.JSON.parseArray(r2, r4)
            return r2
        L2f:
            return r0
    }

    public static long getLong(java.util.Map<java.lang.String, java.lang.Object> r2, java.lang.String r3) {
            r0 = 0
            long r2 = getLong(r2, r3, r0)
            return r2
    }

    public static long getLong(java.util.Map<java.lang.String, java.lang.Object> r0, java.lang.String r1, long r2) {
            java.lang.String r0 = getString(r0, r1)     // Catch: java.lang.Throwable -> L9
            long r0 = java.lang.Long.parseLong(r0)     // Catch: java.lang.Throwable -> L9
            return r0
        L9:
            return r2
    }

    public static java.util.Map<java.lang.String, java.lang.Object> getMap(java.util.Map<java.lang.String, java.lang.Object> r2, java.lang.String r3) {
            androidx.collection.ArrayMap r0 = new androidx.collection.ArrayMap
            r0.<init>()
            if (r2 == 0) goto L29
            int r1 = r2.size()
            if (r1 != 0) goto Le
            goto L29
        Le:
            boolean r1 = isNull(r3)
            if (r1 == 0) goto L15
            goto L29
        L15:
            boolean r1 = r2.containsKey(r3)
            if (r1 == 0) goto L29
            java.lang.Object r2 = r2.get(r3)
            if (r2 != 0) goto L22
            goto L29
        L22:
            boolean r3 = r2 instanceof java.util.Map
            if (r3 == 0) goto L29
            java.util.Map r2 = (java.util.Map) r2
            return r2
        L29:
            return r0
    }

    public static java.lang.String getMoney(java.util.Map<java.lang.String, java.lang.Object> r1, java.lang.String r2) {
            java.lang.String r0 = "0.00"
            double r1 = getDouble(r1, r2)     // Catch: java.lang.Throwable -> Lb
            java.lang.String r1 = formatMoney(r1)     // Catch: java.lang.Throwable -> Lb
            return r1
        Lb:
            return r0
    }

    public static java.lang.String getString(java.util.Map<java.lang.String, java.lang.Object> r1, java.lang.String r2) {
            java.lang.String r0 = ""
            java.lang.String r1 = getString(r1, r2, r0)
            return r1
    }

    public static java.lang.String getString(java.util.Map<java.lang.String, java.lang.Object> r1, java.lang.String r2, java.lang.String r3) {
            if (r1 == 0) goto L33
            int r0 = r1.size()
            if (r0 != 0) goto L9
            goto L33
        L9:
            boolean r0 = isNull(r2)
            if (r0 == 0) goto L10
            goto L33
        L10:
            boolean r0 = r1.containsKey(r2)
            if (r0 == 0) goto L33
            java.lang.Object r0 = r1.get(r2)
            if (r0 != 0) goto L1f
            java.lang.String r1 = ""
            return r1
        L1f:
            java.lang.String r0 = java.lang.String.valueOf(r0)
            boolean r0 = isNull(r0)
            if (r0 == 0) goto L2a
            goto L33
        L2a:
            java.lang.Object r1 = r1.get(r2)
            java.lang.String r1 = r1.toString()
            return r1
        L33:
            return r3
    }

    public static boolean isNull(java.lang.String r1) {
            if (r1 == 0) goto L15
            java.lang.String r0 = ""
            boolean r0 = r1.equals(r0)
            if (r0 != 0) goto L15
            java.lang.String r0 = "null"
            boolean r1 = r1.equalsIgnoreCase(r0)
            if (r1 == 0) goto L13
            goto L15
        L13:
            r1 = 0
            return r1
        L15:
            r1 = 1
            return r1
    }

    public static boolean isNull2(java.lang.String r1) {
            if (r1 == 0) goto Ld
            java.lang.String r0 = ""
            boolean r1 = r1.equals(r0)
            if (r1 == 0) goto Lb
            goto Ld
        Lb:
            r1 = 0
            return r1
        Ld:
            r1 = 1
            return r1
    }

    public static java.util.List<java.util.Map<java.lang.String, java.lang.Object>> jsonToListMap(java.lang.String r2) throws com.alibaba.fastjson.JSONException {
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            boolean r1 = android.text.TextUtils.isEmpty(r2)
            if (r1 != 0) goto L1e
            cn.bluemobi.dylan.http.JsonParse$4 r0 = new cn.bluemobi.dylan.http.JsonParse$4
            r0.<init>()
            java.lang.reflect.Type r0 = r0.getType()
            r1 = 0
            com.alibaba.fastjson.parser.Feature[] r1 = new com.alibaba.fastjson.parser.Feature[r1]
            java.lang.Object r2 = com.alibaba.fastjson.JSON.parseObject(r2, r0, r1)
            java.util.List r2 = (java.util.List) r2
            return r2
        L1e:
            return r0
    }

    public static androidx.collection.ArrayMap<java.lang.String, java.lang.Object> jsonToMap(java.lang.String r2) throws com.alibaba.fastjson.JSONException {
            androidx.collection.ArrayMap r0 = new androidx.collection.ArrayMap
            r0.<init>()
            boolean r1 = android.text.TextUtils.isEmpty(r2)
            if (r1 != 0) goto L1e
            cn.bluemobi.dylan.http.JsonParse$3 r0 = new cn.bluemobi.dylan.http.JsonParse$3
            r0.<init>()
            java.lang.reflect.Type r0 = r0.getType()
            r1 = 0
            com.alibaba.fastjson.parser.Feature[] r1 = new com.alibaba.fastjson.parser.Feature[r1]
            java.lang.Object r2 = com.alibaba.fastjson.JSON.parseObject(r2, r0, r1)
            androidx.collection.ArrayMap r2 = (androidx.collection.ArrayMap) r2
            return r2
        L1e:
            return r0
    }

    @Override // cn.bluemobi.dylan.http.HttpJsonKey
    public java.lang.String getCode() {
            r1 = this;
            java.lang.String r0 = r1.code
            return r0
    }

    @Override // cn.bluemobi.dylan.http.HttpJsonKey
    public java.lang.String getData() {
            r1 = this;
            java.lang.String r0 = r1.data
            return r0
    }

    @Override // cn.bluemobi.dylan.http.HttpJsonKey
    public java.lang.String getMsg() {
            r1 = this;
            java.lang.String r0 = r1.msg
            return r0
    }

    @Override // cn.bluemobi.dylan.http.HttpJsonKey
    public int getSuccessCode() {
            r1 = this;
            int r0 = r1.successCode
            return r0
    }

    public cn.bluemobi.dylan.http.JsonParse initJson(java.lang.String r1, java.lang.String r2, java.lang.String r3, int r4) {
            r0 = this;
            cn.bluemobi.dylan.http.JsonParse r1 = r0.setCode(r1)
            cn.bluemobi.dylan.http.JsonParse r1 = r1.setData(r2)
            cn.bluemobi.dylan.http.JsonParse r1 = r1.setMsg(r3)
            r1.setSuccessCode(r4)
            cn.bluemobi.dylan.http.JsonParse r1 = cn.bluemobi.dylan.http.JsonParse.jsonParse
            return r1
    }

    public androidx.collection.ArrayMap<java.lang.String, java.lang.Object> jsonParse(java.lang.String r4) throws com.alibaba.fastjson.JSONException {
            r3 = this;
            java.lang.String r0 = r3.getCode()
            java.lang.String r1 = r3.getData()
            java.lang.String r2 = r3.getMsg()
            androidx.collection.ArrayMap r4 = r3.jsonParse(r4, r0, r1, r2)
            return r4
    }

    public androidx.collection.ArrayMap<java.lang.String, java.lang.Object> jsonParse(java.lang.String r6, java.lang.String r7, java.lang.String r8, java.lang.String r9) throws com.alibaba.fastjson.JSONException {
            r5 = this;
            cn.bluemobi.dylan.http.JsonParse$1 r0 = new cn.bluemobi.dylan.http.JsonParse$1
            r0.<init>(r5)
            java.lang.reflect.Type r0 = r0.getType()
            r1 = 0
            com.alibaba.fastjson.parser.Feature[] r2 = new com.alibaba.fastjson.parser.Feature[r1]
            java.lang.Object r6 = com.alibaba.fastjson.JSON.parseObject(r6, r0, r2)
            androidx.collection.ArrayMap r6 = (androidx.collection.ArrayMap) r6
            androidx.collection.ArrayMap r0 = new androidx.collection.ArrayMap
            r0.<init>()
            androidx.collection.ArrayMap r2 = new androidx.collection.ArrayMap
            r2.<init>()
            boolean r3 = r6.containsKey(r8)
            if (r3 == 0) goto L82
            java.lang.Object r3 = r6.get(r8)
            boolean r4 = r3 instanceof java.lang.String
            if (r4 != 0) goto L78
            boolean r4 = r3 instanceof java.lang.Integer
            if (r4 != 0) goto L78
            boolean r4 = r3 instanceof java.lang.Long
            if (r4 != 0) goto L78
            boolean r4 = r3 instanceof java.lang.Float
            if (r4 != 0) goto L78
            boolean r4 = r3 instanceof java.lang.Double
            if (r4 != 0) goto L78
            boolean r4 = r3 instanceof java.lang.Character
            if (r4 != 0) goto L78
            boolean r4 = r3 instanceof java.lang.Boolean
            if (r4 != 0) goto L78
            boolean r4 = r3 instanceof java.lang.Byte
            if (r4 != 0) goto L78
            boolean r4 = r3 instanceof java.lang.Short
            if (r4 == 0) goto L4b
            goto L78
        L4b:
            boolean r4 = r3 instanceof com.alibaba.fastjson.JSONArray
            if (r4 == 0) goto L56
            r2.put(r8, r3)
            r0.put(r8, r2)
            goto L82
        L56:
            boolean r4 = r3 instanceof com.alibaba.fastjson.JSONObject
            if (r4 == 0) goto L74
            java.lang.String r2 = r3.toString()
            cn.bluemobi.dylan.http.JsonParse$2 r3 = new cn.bluemobi.dylan.http.JsonParse$2
            r3.<init>(r5)
            java.lang.reflect.Type r3 = r3.getType()
            com.alibaba.fastjson.parser.Feature[] r1 = new com.alibaba.fastjson.parser.Feature[r1]
            java.lang.Object r1 = com.alibaba.fastjson.JSON.parseObject(r2, r3, r1)
            r2 = r1
            androidx.collection.ArrayMap r2 = (androidx.collection.ArrayMap) r2
            r0.put(r8, r2)
            goto L82
        L74:
            r0.put(r8, r2)
            goto L82
        L78:
            java.lang.String r1 = r3.toString()
            r2.put(r8, r1)
            r0.put(r8, r2)
        L82:
            java.util.Set r1 = r6.keySet()
            java.util.Iterator r1 = r1.iterator()
        L8a:
            boolean r3 = r1.hasNext()
            if (r3 == 0) goto Lbb
            java.lang.Object r3 = r1.next()
            java.lang.String r3 = (java.lang.String) r3
            boolean r4 = r3.equals(r8)
            if (r4 != 0) goto L8a
            boolean r4 = r2.containsKey(r3)
            if (r4 == 0) goto Lb3
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>()
            r4.append(r3)
            java.lang.String r3 = "2"
            r4.append(r3)
            java.lang.String r3 = r4.toString()
        Lb3:
            java.lang.Object r4 = r6.get(r3)
            r2.put(r3, r4)
            goto L8a
        Lbb:
            r0.put(r8, r2)
            boolean r8 = r6.containsKey(r7)
            if (r8 == 0) goto Ld7
            int r8 = getInt(r6, r7)
            java.lang.Integer r8 = java.lang.Integer.valueOf(r8)
            r0.put(r7, r8)
            java.lang.String r6 = getString(r6, r9)
            r0.put(r9, r6)
            return r0
        Ld7:
            com.alibaba.fastjson.JSONException r6 = new com.alibaba.fastjson.JSONException
            r6.<init>()
            throw r6
    }

    public cn.bluemobi.dylan.http.JsonParse setCode(java.lang.String r1) {
            r0 = this;
            r0.code = r1
            return r0
    }

    public cn.bluemobi.dylan.http.JsonParse setData(java.lang.String r1) {
            r0 = this;
            r0.data = r1
            return r0
    }

    public cn.bluemobi.dylan.http.JsonParse setMsg(java.lang.String r1) {
            r0 = this;
            r0.msg = r1
            return r0
    }

    public cn.bluemobi.dylan.http.JsonParse setSuccessCode(int r1) {
            r0 = this;
            r0.successCode = r1
            return r0
    }
}
