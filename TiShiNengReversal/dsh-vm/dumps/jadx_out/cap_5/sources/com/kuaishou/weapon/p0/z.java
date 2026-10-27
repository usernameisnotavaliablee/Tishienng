package com.kuaishou.weapon.p0;

/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_5_sz8796392.dex */
public class z {
    private java.lang.String a;
    private java.lang.String b;
    private java.lang.String c;
    private java.lang.String d;
    private java.util.Set<java.lang.String> e;
    private java.util.Set<java.lang.String> f;
    private java.util.Set<java.lang.String> g;
    private java.util.Set<java.lang.String> h;

    public z() {
            r2 = this;
            r2.<init>()
            java.util.HashSet r0 = new java.util.HashSet
            r0.<init>()
            r2.e = r0
            java.util.HashSet r0 = new java.util.HashSet
            r0.<init>()
            r2.f = r0
            java.util.HashSet r0 = new java.util.HashSet
            r0.<init>()
            r2.g = r0
            java.util.HashSet r0 = new java.util.HashSet
            r0.<init>()
            r2.h = r0
            java.lang.String r0 = "f118f1f9431de3a626df48d7302911"
            java.lang.String r1 = "0820"
            java.lang.String r0 = com.kuaishou.weapon.p0.i.a(r0, r1)
            r2.a = r0
            java.lang.String r0 = "f118f1ef4616f3fc27d1"
            java.lang.String r0 = com.kuaishou.weapon.p0.i.a(r0, r1)
            r2.b = r0
            java.lang.String r0 = "f118f1e84f0bf5ba3bd1579c6d35"
            java.lang.String r0 = com.kuaishou.weapon.p0.i.a(r0, r1)
            r2.c = r0
            java.lang.String r0 = "fc03e7a44510"
            java.lang.String r0 = com.kuaishou.weapon.p0.i.a(r0, r1)
            r2.d = r0
            return
    }

    public int a() {
            r1 = this;
            java.util.Set<java.lang.String> r0 = r1.f     // Catch: java.lang.Exception -> L11
            if (r0 == 0) goto L11
            int r0 = r0.size()     // Catch: java.lang.Exception -> L11
            if (r0 <= 0) goto L11
            java.util.Set<java.lang.String> r0 = r1.f     // Catch: java.lang.Exception -> L11
            int r0 = r0.size()     // Catch: java.lang.Exception -> L11
            return r0
        L11:
            r0 = 0
            return r0
    }

    public org.json.JSONArray a(android.content.Context r9) {
            r8 = this;
            r0 = 0
            java.io.BufferedReader r1 = new java.io.BufferedReader     // Catch: java.lang.Throwable -> L1e7 java.lang.Exception -> L1e9
            java.io.FileReader r2 = new java.io.FileReader     // Catch: java.lang.Throwable -> L1e7 java.lang.Exception -> L1e9
            java.lang.String r3 = "/proc/self/maps"
            r2.<init>(r3)     // Catch: java.lang.Throwable -> L1e7 java.lang.Exception -> L1e9
            r1.<init>(r2)     // Catch: java.lang.Throwable -> L1e7 java.lang.Exception -> L1e9
            java.util.HashSet r2 = new java.util.HashSet     // Catch: java.lang.Throwable -> L8b java.lang.Exception -> L8f
            r2.<init>()     // Catch: java.lang.Throwable -> L8b java.lang.Exception -> L8f
            java.util.HashSet r3 = new java.util.HashSet     // Catch: java.lang.Throwable -> L8b java.lang.Exception -> L8f
            r3.<init>()     // Catch: java.lang.Throwable -> L8b java.lang.Exception -> L8f
            java.lang.String r4 = "/system/fr"
            r3.add(r4)     // Catch: java.lang.Throwable -> L8b java.lang.Exception -> L8f
            java.lang.String r4 = "/system/em"
            r3.add(r4)     // Catch: java.lang.Throwable -> L8b java.lang.Exception -> L8f
            java.lang.String r4 = "/apex/com."
            r3.add(r4)     // Catch: java.lang.Throwable -> L8b java.lang.Exception -> L8f
            java.lang.String r4 = "/data/dalv"
            r3.add(r4)     // Catch: java.lang.Throwable -> L8b java.lang.Exception -> L8f
            java.lang.String r4 = "/system/li"
            r3.add(r4)     // Catch: java.lang.Throwable -> L8b java.lang.Exception -> L8f
            java.lang.String r4 = "/vendor/li"
            r3.add(r4)     // Catch: java.lang.Throwable -> L8b java.lang.Exception -> L8f
            java.lang.String r4 = "/system/ve"
            r3.add(r4)     // Catch: java.lang.Throwable -> L8b java.lang.Exception -> L8f
            java.lang.String r9 = r9.getPackageName()     // Catch: java.lang.Throwable -> L8b java.lang.Exception -> L8f
            boolean r4 = android.text.TextUtils.isEmpty(r9)     // Catch: java.lang.Throwable -> L8b java.lang.Exception -> L8f
            if (r4 == 0) goto L48
            r1.close()     // Catch: java.io.IOException -> L47
        L47:
            return r0
        L48:
            java.util.Set<java.lang.String> r4 = r8.e     // Catch: java.lang.Throwable -> L8b java.lang.Exception -> L8f
            r4.clear()     // Catch: java.lang.Throwable -> L8b java.lang.Exception -> L8f
            java.util.Set<java.lang.String> r4 = r8.f     // Catch: java.lang.Throwable -> L8b java.lang.Exception -> L8f
            r4.clear()     // Catch: java.lang.Throwable -> L8b java.lang.Exception -> L8f
            java.util.Set<java.lang.String> r4 = r8.g     // Catch: java.lang.Throwable -> L8b java.lang.Exception -> L8f
            r4.clear()     // Catch: java.lang.Throwable -> L8b java.lang.Exception -> L8f
            java.util.Set<java.lang.String> r4 = r8.h     // Catch: java.lang.Throwable -> L8b java.lang.Exception -> L8f
            r4.clear()     // Catch: java.lang.Throwable -> L8b java.lang.Exception -> L8f
        L5c:
            java.lang.String r4 = r1.readLine()     // Catch: java.lang.Throwable -> L8b java.lang.Exception -> L8f
            if (r4 == 0) goto L1d4
            java.lang.String r5 = ".apk"
            boolean r5 = r4.endsWith(r5)     // Catch: java.lang.Throwable -> L8b java.lang.Exception -> L8f
            if (r5 != 0) goto L92
            java.lang.String r5 = ".jar"
            boolean r5 = r4.endsWith(r5)     // Catch: java.lang.Throwable -> L8b java.lang.Exception -> L8f
            if (r5 != 0) goto L92
            java.lang.String r5 = ".dex"
            boolean r5 = r4.endsWith(r5)     // Catch: java.lang.Throwable -> L8b java.lang.Exception -> L8f
            if (r5 != 0) goto L92
            java.lang.String r5 = ".odex"
            boolean r5 = r4.endsWith(r5)     // Catch: java.lang.Throwable -> L8b java.lang.Exception -> L8f
            if (r5 != 0) goto L92
            java.lang.String r5 = ".so"
            boolean r5 = r4.endsWith(r5)     // Catch: java.lang.Throwable -> L8b java.lang.Exception -> L8f
            if (r5 == 0) goto L5c
            goto L92
        L8b:
            r9 = move-exception
            r0 = r1
            goto L1eb
        L8f:
            goto L1f2
        L92:
            java.lang.String r5 = "gson.jar"
            boolean r5 = r4.contains(r5)     // Catch: java.lang.Throwable -> L8b java.lang.Exception -> L8f
            if (r5 != 0) goto L5c
            java.lang.String r5 = "volley.jar"
            boolean r5 = r4.contains(r5)     // Catch: java.lang.Throwable -> L8b java.lang.Exception -> L8f
            if (r5 != 0) goto L5c
            java.lang.String r5 = "FwkPlugin"
            boolean r5 = r4.contains(r5)     // Catch: java.lang.Throwable -> L8b java.lang.Exception -> L8f
            if (r5 != 0) goto L5c
            r5 = 47
            int r5 = r4.indexOf(r5)     // Catch: java.lang.Throwable -> L8b java.lang.Exception -> L8f
            if (r5 < 0) goto L5c
            java.lang.String r4 = r4.substring(r5)     // Catch: java.lang.Throwable -> L8b java.lang.Exception -> L8f
            java.lang.String r5 = r8.a     // Catch: java.lang.Throwable -> L8b java.lang.Exception -> L8f
            boolean r5 = r4.contains(r5)     // Catch: java.lang.Throwable -> L8b java.lang.Exception -> L8f
            if (r5 != 0) goto L1cd
            java.lang.String r5 = r8.b     // Catch: java.lang.Throwable -> L8b java.lang.Exception -> L8f
            boolean r5 = r4.contains(r5)     // Catch: java.lang.Throwable -> L8b java.lang.Exception -> L8f
            if (r5 != 0) goto L1cd
            java.lang.String r5 = r8.c     // Catch: java.lang.Throwable -> L8b java.lang.Exception -> L8f
            boolean r5 = r4.contains(r5)     // Catch: java.lang.Throwable -> L8b java.lang.Exception -> L8f
            if (r5 == 0) goto Ld0
            goto L1cd
        Ld0:
            java.lang.String r5 = r8.d     // Catch: java.lang.Throwable -> L8b java.lang.Exception -> L8f
            boolean r5 = r4.contains(r5)     // Catch: java.lang.Throwable -> L8b java.lang.Exception -> L8f
            if (r5 == 0) goto Led
            java.lang.String r5 = "libart.so"
            boolean r5 = r4.contains(r5)     // Catch: java.lang.Throwable -> L8b java.lang.Exception -> L8f
            if (r5 != 0) goto Led
            java.lang.String r5 = "libart64.so"
            boolean r5 = r4.contains(r5)     // Catch: java.lang.Throwable -> L8b java.lang.Exception -> L8f
            if (r5 != 0) goto Led
            java.util.Set<java.lang.String> r5 = r8.h     // Catch: java.lang.Throwable -> L8b java.lang.Exception -> L8f
            r5.add(r4)     // Catch: java.lang.Throwable -> L8b java.lang.Exception -> L8f
        Led:
            java.lang.String r5 = "es/.0/"
            boolean r5 = r4.contains(r5)     // Catch: java.lang.Throwable -> L8b java.lang.Exception -> L8f
            if (r5 != 0) goto L5c
            java.lang.String r5 = "app_DvaPlugin"
            boolean r5 = r4.contains(r5)     // Catch: java.lang.Throwable -> L8b java.lang.Exception -> L8f
            if (r5 != 0) goto L5c
            java.lang.String r5 = "/system_ext/"
            boolean r5 = r4.contains(r5)     // Catch: java.lang.Throwable -> L8b java.lang.Exception -> L8f
            if (r5 != 0) goto L5c
            boolean r5 = r4.contains(r9)     // Catch: java.lang.Throwable -> L8b java.lang.Exception -> L8f
            if (r5 == 0) goto L11b
            java.lang.String r5 = "odex_cache"
            boolean r5 = r4.contains(r5)     // Catch: java.lang.Throwable -> L8b java.lang.Exception -> L8f
            if (r5 != 0) goto L11b
            java.lang.String r5 = "app_"
            boolean r5 = r4.contains(r5)     // Catch: java.lang.Throwable -> L8b java.lang.Exception -> L8f
            if (r5 == 0) goto L5c
        L11b:
            int r5 = r4.length()     // Catch: java.lang.Throwable -> L8b java.lang.Exception -> L8f
            r6 = 10
            if (r5 <= r6) goto L129
            r5 = 0
            java.lang.String r5 = r4.substring(r5, r6)     // Catch: java.lang.Throwable -> L8b java.lang.Exception -> L8f
            goto L12a
        L129:
            r5 = r4
        L12a:
            java.lang.String r7 = "FeatureFramework"
            boolean r7 = r4.contains(r7)     // Catch: java.lang.Throwable -> L8b java.lang.Exception -> L8f
            if (r7 != 0) goto L5c
            java.lang.String r7 = "GmsConfigOverlay"
            boolean r7 = r4.contains(r7)     // Catch: java.lang.Throwable -> L8b java.lang.Exception -> L8f
            if (r7 != 0) goto L5c
            java.lang.String r7 = "/system/app/"
            boolean r7 = r4.contains(r7)     // Catch: java.lang.Throwable -> L8b java.lang.Exception -> L8f
            if (r7 != 0) goto L5c
            java.lang.String r7 = "/system/vendor/lib/"
            boolean r7 = r4.contains(r7)     // Catch: java.lang.Throwable -> L8b java.lang.Exception -> L8f
            if (r7 != 0) goto L5c
            java.lang.String r7 = "/hw_"
            boolean r7 = r4.contains(r7)     // Catch: java.lang.Throwable -> L8b java.lang.Exception -> L8f
            if (r7 != 0) goto L5c
            java.lang.String r7 = "/system/product/lib"
            boolean r7 = r4.contains(r7)     // Catch: java.lang.Throwable -> L8b java.lang.Exception -> L8f
            if (r7 != 0) goto L5c
            java.lang.String r7 = "mokee-"
            boolean r7 = r4.contains(r7)     // Catch: java.lang.Throwable -> L8b java.lang.Exception -> L8f
            if (r7 != 0) goto L1c6
            java.lang.String r7 = "mokee."
            boolean r7 = r4.contains(r7)     // Catch: java.lang.Throwable -> L8b java.lang.Exception -> L8f
            if (r7 == 0) goto L16b
            goto L1c6
        L16b:
            java.lang.String r7 = "lineageos-"
            boolean r7 = r4.contains(r7)     // Catch: java.lang.Throwable -> L8b java.lang.Exception -> L8f
            if (r7 != 0) goto L1bf
            java.lang.String r7 = "lineageos."
            boolean r7 = r4.contains(r7)     // Catch: java.lang.Throwable -> L8b java.lang.Exception -> L8f
            if (r7 != 0) goto L1bf
            java.lang.String r7 = "Hook"
            boolean r7 = r4.contains(r7)     // Catch: java.lang.Throwable -> L8b java.lang.Exception -> L8f
            if (r7 != 0) goto L1bf
            java.lang.String r7 = "hook"
            boolean r7 = r4.contains(r7)     // Catch: java.lang.Throwable -> L8b java.lang.Exception -> L8f
            if (r7 == 0) goto L18c
            goto L1bf
        L18c:
            java.lang.String r7 = "posedBridge"
            boolean r7 = r4.contains(r7)     // Catch: java.lang.Throwable -> L8b java.lang.Exception -> L8f
            if (r7 != 0) goto L19a
            boolean r5 = r3.contains(r5)     // Catch: java.lang.Throwable -> L8b java.lang.Exception -> L8f
            if (r5 != 0) goto L5c
        L19a:
            r2.add(r4)     // Catch: java.lang.Throwable -> L8b java.lang.Exception -> L8f
            int r4 = r2.size()     // Catch: java.lang.Throwable -> L8b java.lang.Exception -> L8f
            r5 = 15
            if (r4 > r5) goto L1d4
            java.util.Set<java.lang.String> r4 = r8.e     // Catch: java.lang.Throwable -> L8b java.lang.Exception -> L8f
            int r4 = r4.size()     // Catch: java.lang.Throwable -> L8b java.lang.Exception -> L8f
            if (r4 > r6) goto L1d4
            java.util.Set<java.lang.String> r4 = r8.f     // Catch: java.lang.Throwable -> L8b java.lang.Exception -> L8f
            int r4 = r4.size()     // Catch: java.lang.Throwable -> L8b java.lang.Exception -> L8f
            if (r4 > r6) goto L1d4
            java.util.Set<java.lang.String> r4 = r8.g     // Catch: java.lang.Throwable -> L8b java.lang.Exception -> L8f
            int r4 = r4.size()     // Catch: java.lang.Throwable -> L8b java.lang.Exception -> L8f
            if (r4 > r6) goto L1d4
            goto L5c
        L1bf:
            java.util.Set<java.lang.String> r5 = r8.g     // Catch: java.lang.Throwable -> L8b java.lang.Exception -> L8f
            r5.add(r4)     // Catch: java.lang.Throwable -> L8b java.lang.Exception -> L8f
            goto L5c
        L1c6:
            java.util.Set<java.lang.String> r5 = r8.f     // Catch: java.lang.Throwable -> L8b java.lang.Exception -> L8f
            r5.add(r4)     // Catch: java.lang.Throwable -> L8b java.lang.Exception -> L8f
            goto L5c
        L1cd:
            java.util.Set<java.lang.String> r5 = r8.e     // Catch: java.lang.Throwable -> L8b java.lang.Exception -> L8f
            r5.add(r4)     // Catch: java.lang.Throwable -> L8b java.lang.Exception -> L8f
            goto L5c
        L1d4:
            int r9 = r2.size()     // Catch: java.lang.Throwable -> L8b java.lang.Exception -> L8f
            if (r9 <= 0) goto L1e3
            org.json.JSONArray r9 = new org.json.JSONArray     // Catch: java.lang.Throwable -> L8b java.lang.Exception -> L8f
            r9.<init>(r2)     // Catch: java.lang.Throwable -> L8b java.lang.Exception -> L8f
            r1.close()     // Catch: java.io.IOException -> L1e2
        L1e2:
            return r9
        L1e3:
            r1.close()     // Catch: java.io.IOException -> L1f5
            goto L1f5
        L1e7:
            r9 = move-exception
            goto L1eb
        L1e9:
            goto L1f1
        L1eb:
            if (r0 == 0) goto L1f0
            r0.close()     // Catch: java.io.IOException -> L1f0
        L1f0:
            throw r9
        L1f1:
            r1 = r0
        L1f2:
            if (r1 == 0) goto L1f5
            goto L1e3
        L1f5:
            return r0
    }

    public java.util.Set<java.lang.String> b() {
            r1 = this;
            java.util.Set<java.lang.String> r0 = r1.g     // Catch: java.lang.Exception -> Ld
            if (r0 == 0) goto Ld
            int r0 = r0.size()     // Catch: java.lang.Exception -> Ld
            if (r0 <= 0) goto Ld
            java.util.Set<java.lang.String> r0 = r1.g     // Catch: java.lang.Exception -> Ld
            return r0
        Ld:
            r0 = 0
            return r0
    }

    public java.util.Set<java.lang.String> c() {
            r1 = this;
            java.util.Set<java.lang.String> r0 = r1.h     // Catch: java.lang.Exception -> Ld
            if (r0 == 0) goto Ld
            int r0 = r0.size()     // Catch: java.lang.Exception -> Ld
            if (r0 <= 0) goto Ld
            java.util.Set<java.lang.String> r0 = r1.h     // Catch: java.lang.Exception -> Ld
            return r0
        Ld:
            r0 = 0
            return r0
    }

    public org.json.JSONObject d() {
            r5 = this;
            java.util.Set<java.lang.String> r0 = r5.e     // Catch: java.lang.Exception -> L53
            if (r0 == 0) goto L53
            int r0 = r0.size()     // Catch: java.lang.Exception -> L53
            if (r0 <= 0) goto L53
            org.json.JSONObject r0 = new org.json.JSONObject     // Catch: java.lang.Exception -> L53
            r0.<init>()     // Catch: java.lang.Exception -> L53
            java.util.Set<java.lang.String> r1 = r5.e     // Catch: java.lang.Exception -> L53
            java.util.Iterator r1 = r1.iterator()     // Catch: java.lang.Exception -> L53
        L15:
            boolean r2 = r1.hasNext()     // Catch: java.lang.Exception -> L53
            if (r2 == 0) goto L4c
            java.lang.Object r2 = r1.next()     // Catch: java.lang.Exception -> L53
            java.lang.String r2 = (java.lang.String) r2     // Catch: java.lang.Exception -> L53
            java.lang.String r3 = r5.a     // Catch: java.lang.Exception -> L53
            boolean r3 = r2.contains(r3)     // Catch: java.lang.Exception -> L53
            r4 = 1
            if (r3 == 0) goto L30
            java.lang.String r2 = "0"
            r0.put(r2, r4)     // Catch: java.lang.Exception -> L53
            goto L15
        L30:
            java.lang.String r3 = r5.b     // Catch: java.lang.Exception -> L53
            boolean r3 = r2.contains(r3)     // Catch: java.lang.Exception -> L53
            if (r3 == 0) goto L3e
            java.lang.String r2 = "1"
            r0.put(r2, r4)     // Catch: java.lang.Exception -> L53
            goto L15
        L3e:
            java.lang.String r3 = r5.c     // Catch: java.lang.Exception -> L53
            boolean r2 = r2.contains(r3)     // Catch: java.lang.Exception -> L53
            if (r2 == 0) goto L15
            java.lang.String r2 = "2"
            r0.put(r2, r4)     // Catch: java.lang.Exception -> L53
            goto L15
        L4c:
            int r1 = r0.length()     // Catch: java.lang.Exception -> L53
            if (r1 <= 0) goto L53
            return r0
        L53:
            r0 = 0
            return r0
    }

    public java.util.Set e() {
            r4 = this;
            java.util.HashSet r0 = new java.util.HashSet     // Catch: java.lang.Exception -> L3b
            r0.<init>()     // Catch: java.lang.Exception -> L3b
            java.util.Set<java.lang.String> r1 = r4.e     // Catch: java.lang.Exception -> L3b
            if (r1 == 0) goto L3b
            int r1 = r1.size()     // Catch: java.lang.Exception -> L3b
            if (r1 <= 0) goto L3b
            java.util.Set<java.lang.String> r1 = r4.e     // Catch: java.lang.Exception -> L3b
            java.util.Iterator r1 = r1.iterator()     // Catch: java.lang.Exception -> L3b
        L15:
            boolean r2 = r1.hasNext()     // Catch: java.lang.Exception -> L3b
            if (r2 == 0) goto L34
            java.lang.Object r2 = r1.next()     // Catch: java.lang.Exception -> L3b
            java.lang.String r2 = (java.lang.String) r2     // Catch: java.lang.Exception -> L3b
            java.lang.String r3 = "dex"
            boolean r3 = r2.endsWith(r3)     // Catch: java.lang.Exception -> L3b
            if (r3 == 0) goto L2c
            r0.add(r2)     // Catch: java.lang.Exception -> L3b
        L2c:
            int r2 = r0.size()     // Catch: java.lang.Exception -> L3b
            r3 = 5
            if (r2 > r3) goto L34
            goto L15
        L34:
            int r1 = r0.size()     // Catch: java.lang.Exception -> L3b
            if (r1 <= 0) goto L3b
            return r0
        L3b:
            r0 = 0
            return r0
    }
}
