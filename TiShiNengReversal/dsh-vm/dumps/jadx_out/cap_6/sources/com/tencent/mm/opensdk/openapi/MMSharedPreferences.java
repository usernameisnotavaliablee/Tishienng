package com.tencent.mm.opensdk.openapi;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_6_sz7847784.dex */
class MMSharedPreferences implements android.content.SharedPreferences {
    private static final java.lang.String TAG = "MicroMsg.SDK.SharedPreferences";
    private final java.lang.String[] columns;
    private final android.content.ContentResolver cr;
    private com.tencent.mm.opensdk.openapi.MMSharedPreferences.REditor editor;
    private final java.util.HashMap<java.lang.String, java.lang.Object> values;

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    private static class REditor implements android.content.SharedPreferences.Editor {
        private boolean clear;
        private android.content.ContentResolver cr;
        private java.util.Set<java.lang.String> remove;
        private java.util.Map<java.lang.String, java.lang.Object> values;

        public REditor(android.content.ContentResolver r2) {
                r1 = this;
                r1.<init>()
                java.util.HashMap r0 = new java.util.HashMap
                r0.<init>()
                r1.values = r0
                java.util.HashSet r0 = new java.util.HashSet
                r0.<init>()
                r1.remove = r0
                r0 = 0
                r1.clear = r0
                r1.cr = r2
                return
        }

        @Override // android.content.SharedPreferences.Editor
        public void apply() {
                r0 = this;
                return
        }

        @Override // android.content.SharedPreferences.Editor
        public android.content.SharedPreferences.Editor clear() {
                r1 = this;
                r0 = 1
                r1.clear = r0
                return r1
        }

        @Override // android.content.SharedPreferences.Editor
        public boolean commit() {
                r9 = this;
                android.content.ContentValues r0 = new android.content.ContentValues
                r0.<init>()
                boolean r1 = r9.clear
                r2 = 0
                if (r1 == 0) goto L14
                android.content.ContentResolver r1 = r9.cr
                android.net.Uri r3 = com.tencent.mm.opensdk.utils.a.a
                r4 = 0
                r1.delete(r3, r4, r4)
                r9.clear = r2
            L14:
                java.util.Set<java.lang.String> r1 = r9.remove
                java.util.Iterator r1 = r1.iterator()
            L1a:
                boolean r3 = r1.hasNext()
                java.lang.String r4 = "key = ?"
                if (r3 == 0) goto L34
                java.lang.Object r3 = r1.next()
                java.lang.String r3 = (java.lang.String) r3
                android.content.ContentResolver r5 = r9.cr
                android.net.Uri r6 = com.tencent.mm.opensdk.utils.a.a
                java.lang.String[] r3 = new java.lang.String[]{r3}
                r5.delete(r6, r4, r3)
                goto L1a
            L34:
                java.util.Map<java.lang.String, java.lang.Object> r1 = r9.values
                java.util.Set r1 = r1.entrySet()
                java.util.Iterator r1 = r1.iterator()
            L3e:
                boolean r3 = r1.hasNext()
                r5 = 1
                if (r3 == 0) goto Lbe
                java.lang.Object r3 = r1.next()
                java.util.Map$Entry r3 = (java.util.Map.Entry) r3
                java.lang.Object r6 = r3.getValue()
                java.lang.String r7 = "MicroMsg.SDK.PluginProvider.Resolver"
                if (r6 != 0) goto L5a
                java.lang.String r5 = "unresolve failed, null value"
            L55:
                com.tencent.mm.opensdk.utils.Log.e(r7, r5)
                r5 = 0
                goto L97
            L5a:
                boolean r8 = r6 instanceof java.lang.Integer
                if (r8 == 0) goto L5f
                goto L97
            L5f:
                boolean r5 = r6 instanceof java.lang.Long
                if (r5 == 0) goto L65
                r5 = 2
                goto L97
            L65:
                boolean r5 = r6 instanceof java.lang.String
                if (r5 == 0) goto L6b
                r5 = 3
                goto L97
            L6b:
                boolean r5 = r6 instanceof java.lang.Boolean
                if (r5 == 0) goto L71
                r5 = 4
                goto L97
            L71:
                boolean r5 = r6 instanceof java.lang.Float
                if (r5 == 0) goto L77
                r5 = 5
                goto L97
            L77:
                boolean r5 = r6 instanceof java.lang.Double
                if (r5 == 0) goto L7d
                r5 = 6
                goto L97
            L7d:
                java.lang.StringBuilder r5 = new java.lang.StringBuilder
                r5.<init>()
                java.lang.String r8 = "unresolve failed, unknown type="
                r5.append(r8)
                java.lang.Class r8 = r6.getClass()
                java.lang.String r8 = r8.toString()
                r5.append(r8)
                java.lang.String r5 = r5.toString()
                goto L55
            L97:
                if (r5 != 0) goto L9a
                goto L3e
            L9a:
                java.lang.Integer r5 = java.lang.Integer.valueOf(r5)
                java.lang.String r7 = "type"
                r0.put(r7, r5)
                java.lang.String r5 = r6.toString()
                java.lang.String r6 = "value"
                r0.put(r6, r5)
                android.content.ContentResolver r5 = r9.cr
                android.net.Uri r6 = com.tencent.mm.opensdk.utils.a.a
                java.lang.Object r3 = r3.getKey()
                java.lang.String r3 = (java.lang.String) r3
                java.lang.String[] r3 = new java.lang.String[]{r3}
                r5.update(r6, r0, r4, r3)
                goto L3e
            Lbe:
                return r5
        }

        @Override // android.content.SharedPreferences.Editor
        public android.content.SharedPreferences.Editor putBoolean(java.lang.String r2, boolean r3) {
                r1 = this;
                java.util.Map<java.lang.String, java.lang.Object> r0 = r1.values
                java.lang.Boolean r3 = java.lang.Boolean.valueOf(r3)
                r0.put(r2, r3)
                java.util.Set<java.lang.String> r3 = r1.remove
                r3.remove(r2)
                return r1
        }

        @Override // android.content.SharedPreferences.Editor
        public android.content.SharedPreferences.Editor putFloat(java.lang.String r2, float r3) {
                r1 = this;
                java.util.Map<java.lang.String, java.lang.Object> r0 = r1.values
                java.lang.Float r3 = java.lang.Float.valueOf(r3)
                r0.put(r2, r3)
                java.util.Set<java.lang.String> r3 = r1.remove
                r3.remove(r2)
                return r1
        }

        @Override // android.content.SharedPreferences.Editor
        public android.content.SharedPreferences.Editor putInt(java.lang.String r2, int r3) {
                r1 = this;
                java.util.Map<java.lang.String, java.lang.Object> r0 = r1.values
                java.lang.Integer r3 = java.lang.Integer.valueOf(r3)
                r0.put(r2, r3)
                java.util.Set<java.lang.String> r3 = r1.remove
                r3.remove(r2)
                return r1
        }

        @Override // android.content.SharedPreferences.Editor
        public android.content.SharedPreferences.Editor putLong(java.lang.String r2, long r3) {
                r1 = this;
                java.util.Map<java.lang.String, java.lang.Object> r0 = r1.values
                java.lang.Long r3 = java.lang.Long.valueOf(r3)
                r0.put(r2, r3)
                java.util.Set<java.lang.String> r3 = r1.remove
                r3.remove(r2)
                return r1
        }

        @Override // android.content.SharedPreferences.Editor
        public android.content.SharedPreferences.Editor putString(java.lang.String r2, java.lang.String r3) {
                r1 = this;
                java.util.Map<java.lang.String, java.lang.Object> r0 = r1.values
                r0.put(r2, r3)
                java.util.Set<java.lang.String> r3 = r1.remove
                r3.remove(r2)
                return r1
        }

        @Override // android.content.SharedPreferences.Editor
        public android.content.SharedPreferences.Editor putStringSet(java.lang.String r1, java.util.Set<java.lang.String> r2) {
                r0 = this;
                r1 = 0
                return r1
        }

        @Override // android.content.SharedPreferences.Editor
        public android.content.SharedPreferences.Editor remove(java.lang.String r2) {
                r1 = this;
                java.util.Set<java.lang.String> r0 = r1.remove
                r0.add(r2)
                return r1
        }
    }

    public MMSharedPreferences(android.content.Context r5) {
            r4 = this;
            r4.<init>()
            java.lang.String r0 = "type"
            java.lang.String r1 = "value"
            java.lang.String r2 = "_id"
            java.lang.String r3 = "key"
            java.lang.String[] r0 = new java.lang.String[]{r2, r3, r0, r1}
            r4.columns = r0
            java.util.HashMap r0 = new java.util.HashMap
            r0.<init>()
            r4.values = r0
            r0 = 0
            r4.editor = r0
            android.content.ContentResolver r5 = r5.getContentResolver()
            r4.cr = r5
            return
    }

    private java.lang.Object getValue(java.lang.String r9) {
            r8 = this;
            r1 = 0
            android.content.ContentResolver r2 = r8.cr     // Catch: java.lang.Exception -> L34
            android.net.Uri r3 = com.tencent.mm.opensdk.utils.a.a     // Catch: java.lang.Exception -> L34
            java.lang.String[] r4 = r8.columns     // Catch: java.lang.Exception -> L34
            java.lang.String r5 = "key = ?"
            java.lang.String[] r6 = new java.lang.String[]{r9}     // Catch: java.lang.Exception -> L34
            r7 = 0
            android.database.Cursor r9 = r2.query(r3, r4, r5, r6, r7)     // Catch: java.lang.Exception -> L34
            if (r9 != 0) goto L15
            return r1
        L15:
            java.lang.String r0 = "type"
            int r0 = r9.getColumnIndex(r0)     // Catch: java.lang.Exception -> L34
            java.lang.String r2 = "value"
            int r2 = r9.getColumnIndex(r2)     // Catch: java.lang.Exception -> L34
            boolean r3 = r9.moveToFirst()     // Catch: java.lang.Exception -> L34
            if (r3 == 0) goto L37
            int r0 = r9.getInt(r0)     // Catch: java.lang.Exception -> L34
            java.lang.String r2 = r9.getString(r2)     // Catch: java.lang.Exception -> L34
            java.lang.Object r0 = com.tencent.mm.opensdk.channel.a.a.a(r0, r2)     // Catch: java.lang.Exception -> L34
            goto L38
        L34:
            r0 = move-exception
            r9 = r0
            goto L3c
        L37:
            r0 = r1
        L38:
            r9.close()     // Catch: java.lang.Exception -> L34
            return r0
        L3c:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r2 = "getValue exception:"
            r0.append(r2)
            java.lang.String r9 = r9.getMessage()
            r0.append(r9)
            java.lang.String r9 = r0.toString()
            java.lang.String r0 = "MicroMsg.SDK.SharedPreferences"
            com.tencent.mm.opensdk.utils.Log.e(r0, r9)
            return r1
    }

    @Override // android.content.SharedPreferences
    public boolean contains(java.lang.String r1) {
            r0 = this;
            java.lang.Object r1 = r0.getValue(r1)
            if (r1 == 0) goto L8
            r1 = 1
            return r1
        L8:
            r1 = 0
            return r1
    }

    @Override // android.content.SharedPreferences
    public android.content.SharedPreferences.Editor edit() {
            r2 = this;
            com.tencent.mm.opensdk.openapi.MMSharedPreferences$REditor r0 = r2.editor
            if (r0 != 0) goto Ld
            com.tencent.mm.opensdk.openapi.MMSharedPreferences$REditor r0 = new com.tencent.mm.opensdk.openapi.MMSharedPreferences$REditor
            android.content.ContentResolver r1 = r2.cr
            r0.<init>(r1)
            r2.editor = r0
        Ld:
            com.tencent.mm.opensdk.openapi.MMSharedPreferences$REditor r0 = r2.editor
            return r0
    }

    @Override // android.content.SharedPreferences
    public java.util.Map<java.lang.String, ?> getAll() {
            r7 = this;
            android.content.ContentResolver r0 = r7.cr     // Catch: java.lang.Exception -> L3f
            android.net.Uri r1 = com.tencent.mm.opensdk.utils.a.a     // Catch: java.lang.Exception -> L3f
            java.lang.String[] r2 = r7.columns     // Catch: java.lang.Exception -> L3f
            r4 = 0
            r5 = 0
            r3 = 0
            android.database.Cursor r0 = r0.query(r1, r2, r3, r4, r5)     // Catch: java.lang.Exception -> L3f
            if (r0 != 0) goto L11
            r0 = 0
            return r0
        L11:
            java.lang.String r1 = "key"
            int r1 = r0.getColumnIndex(r1)     // Catch: java.lang.Exception -> L3f
            java.lang.String r2 = "type"
            int r2 = r0.getColumnIndex(r2)     // Catch: java.lang.Exception -> L3f
            java.lang.String r3 = "value"
            int r3 = r0.getColumnIndex(r3)     // Catch: java.lang.Exception -> L3f
        L23:
            boolean r4 = r0.moveToNext()     // Catch: java.lang.Exception -> L3f
            if (r4 == 0) goto L41
            int r4 = r0.getInt(r2)     // Catch: java.lang.Exception -> L3f
            java.lang.String r5 = r0.getString(r3)     // Catch: java.lang.Exception -> L3f
            java.lang.Object r4 = com.tencent.mm.opensdk.channel.a.a.a(r4, r5)     // Catch: java.lang.Exception -> L3f
            java.util.HashMap<java.lang.String, java.lang.Object> r5 = r7.values     // Catch: java.lang.Exception -> L3f
            java.lang.String r6 = r0.getString(r1)     // Catch: java.lang.Exception -> L3f
            r5.put(r6, r4)     // Catch: java.lang.Exception -> L3f
            goto L23
        L3f:
            r0 = move-exception
            goto L47
        L41:
            r0.close()     // Catch: java.lang.Exception -> L3f
            java.util.HashMap<java.lang.String, java.lang.Object> r0 = r7.values     // Catch: java.lang.Exception -> L3f
            return r0
        L47:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "getAll exception:"
            r1.append(r2)
            java.lang.String r0 = r0.getMessage()
            r1.append(r0)
            java.lang.String r0 = r1.toString()
            java.lang.String r1 = "MicroMsg.SDK.SharedPreferences"
            com.tencent.mm.opensdk.utils.Log.e(r1, r0)
            java.util.HashMap<java.lang.String, java.lang.Object> r0 = r7.values
            return r0
    }

    @Override // android.content.SharedPreferences
    public boolean getBoolean(java.lang.String r2, boolean r3) {
            r1 = this;
            java.lang.Object r2 = r1.getValue(r2)
            if (r2 == 0) goto L11
            boolean r0 = r2 instanceof java.lang.Boolean
            if (r0 == 0) goto L11
            java.lang.Boolean r2 = (java.lang.Boolean) r2
            boolean r2 = r2.booleanValue()
            return r2
        L11:
            return r3
    }

    @Override // android.content.SharedPreferences
    public float getFloat(java.lang.String r2, float r3) {
            r1 = this;
            java.lang.Object r2 = r1.getValue(r2)
            if (r2 == 0) goto L11
            boolean r0 = r2 instanceof java.lang.Float
            if (r0 == 0) goto L11
            java.lang.Float r2 = (java.lang.Float) r2
            float r2 = r2.floatValue()
            return r2
        L11:
            return r3
    }

    @Override // android.content.SharedPreferences
    public int getInt(java.lang.String r2, int r3) {
            r1 = this;
            java.lang.Object r2 = r1.getValue(r2)
            if (r2 == 0) goto L11
            boolean r0 = r2 instanceof java.lang.Integer
            if (r0 == 0) goto L11
            java.lang.Integer r2 = (java.lang.Integer) r2
            int r2 = r2.intValue()
            return r2
        L11:
            return r3
    }

    @Override // android.content.SharedPreferences
    public long getLong(java.lang.String r2, long r3) {
            r1 = this;
            java.lang.Object r2 = r1.getValue(r2)
            if (r2 == 0) goto L11
            boolean r0 = r2 instanceof java.lang.Long
            if (r0 == 0) goto L11
            java.lang.Long r2 = (java.lang.Long) r2
            long r2 = r2.longValue()
            return r2
        L11:
            return r3
    }

    @Override // android.content.SharedPreferences
    public java.lang.String getString(java.lang.String r2, java.lang.String r3) {
            r1 = this;
            java.lang.Object r2 = r1.getValue(r2)
            if (r2 == 0) goto Ld
            boolean r0 = r2 instanceof java.lang.String
            if (r0 == 0) goto Ld
            java.lang.String r2 = (java.lang.String) r2
            return r2
        Ld:
            return r3
    }

    @Override // android.content.SharedPreferences
    public java.util.Set<java.lang.String> getStringSet(java.lang.String r1, java.util.Set<java.lang.String> r2) {
            r0 = this;
            r1 = 0
            return r1
    }

    @Override // android.content.SharedPreferences
    public void registerOnSharedPreferenceChangeListener(android.content.SharedPreferences.OnSharedPreferenceChangeListener r1) {
            r0 = this;
            return
    }

    @Override // android.content.SharedPreferences
    public void unregisterOnSharedPreferenceChangeListener(android.content.SharedPreferences.OnSharedPreferenceChangeListener r1) {
            r0 = this;
            return
    }
}
