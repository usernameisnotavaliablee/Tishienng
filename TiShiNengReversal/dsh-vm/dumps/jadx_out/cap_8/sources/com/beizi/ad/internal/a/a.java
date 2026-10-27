package com.beizi.ad.internal.a;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Volumes/前任肥胖/下载/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_8_sz9482380.dex */
public class a {
    private static com.beizi.ad.internal.a.a a;

    /* renamed from: c, reason: collision with root package name */
    private static java.util.Map<java.lang.String, java.util.LinkedList<com.beizi.ad.internal.a.b>> f6535c;

    /* renamed from: d, reason: collision with root package name */
    private static android.content.Context f6536d;

    /* renamed from: b, reason: collision with root package name */
    private java.lang.String f6537b;






    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    /* renamed from: com.beizi.ad.internal.a.a$6, reason: invalid class name */
    static /* synthetic */ class AnonymousClass6 {
        static final /* synthetic */ int[] a = null;

        static {
                com.beizi.ad.internal.k[] r0 = com.beizi.ad.internal.k.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                com.beizi.ad.internal.a.a.AnonymousClass6.a = r0
                com.beizi.ad.internal.k r1 = com.beizi.ad.internal.k.f7000b     // Catch: java.lang.NoSuchFieldError -> L12
                int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> L12
                r2 = 1
                r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> L12
            L12:
                int[] r0 = com.beizi.ad.internal.a.a.AnonymousClass6.a     // Catch: java.lang.NoSuchFieldError -> L1d
                com.beizi.ad.internal.k r1 = com.beizi.ad.internal.k.f7005g     // Catch: java.lang.NoSuchFieldError -> L1d
                int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> L1d
                r2 = 2
                r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> L1d
            L1d:
                int[] r0 = com.beizi.ad.internal.a.a.AnonymousClass6.a     // Catch: java.lang.NoSuchFieldError -> L28
                com.beizi.ad.internal.k r1 = com.beizi.ad.internal.k.f7003e     // Catch: java.lang.NoSuchFieldError -> L28
                int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> L28
                r2 = 3
                r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> L28
            L28:
                int[] r0 = com.beizi.ad.internal.a.a.AnonymousClass6.a     // Catch: java.lang.NoSuchFieldError -> L33
                com.beizi.ad.internal.k r1 = com.beizi.ad.internal.k.f7004f     // Catch: java.lang.NoSuchFieldError -> L33
                int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> L33
                r2 = 4
                r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> L33
            L33:
                return
        }

        public AnonymousClass6() {
                r1 = this;
                r1.<init>()
                return
        }
    }

    static {
            java.util.HashMap r0 = new java.util.HashMap
            r0.<init>()
            com.beizi.ad.internal.a.a.f6535c = r0
            return
    }

    public a() {
            r1 = this;
            r1.<init>()
            java.lang.String r0 = "KEY_AD_CACHE_CONTENT_"
            r1.f6537b = r0
            return
    }

    public static synchronized com.beizi.ad.internal.a.a a() {
            java.lang.Class<com.beizi.ad.internal.a.a> r0 = com.beizi.ad.internal.a.a.class
            monitor-enter(r0)
            com.beizi.ad.internal.a.a r1 = com.beizi.ad.internal.a.a.a     // Catch: java.lang.Throwable -> L20
            if (r1 != 0) goto L22
            java.lang.Class<com.beizi.ad.internal.a.a> r1 = com.beizi.ad.internal.a.a.class
            monitor-enter(r1)     // Catch: java.lang.Throwable -> L20
            com.beizi.ad.internal.h r2 = com.beizi.ad.internal.h.a()     // Catch: java.lang.Throwable -> L1d
            android.content.Context r2 = r2.e()     // Catch: java.lang.Throwable -> L1d
            com.beizi.ad.internal.a.a.f6536d = r2     // Catch: java.lang.Throwable -> L1d
            com.beizi.ad.internal.a.a r2 = new com.beizi.ad.internal.a.a     // Catch: java.lang.Throwable -> L1d
            r2.<init>()     // Catch: java.lang.Throwable -> L1d
            com.beizi.ad.internal.a.a.a = r2     // Catch: java.lang.Throwable -> L1d
            monitor-exit(r1)     // Catch: java.lang.Throwable -> L1d
            goto L22
        L1d:
            r2 = move-exception
            monitor-exit(r1)     // Catch: java.lang.Throwable -> L1d
            throw r2     // Catch: java.lang.Throwable -> L20
        L20:
            r1 = move-exception
            goto L26
        L22:
            com.beizi.ad.internal.a.a r1 = com.beizi.ad.internal.a.a.a     // Catch: java.lang.Throwable -> L20
            monitor-exit(r0)
            return r1
        L26:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L20
            throw r1
    }

    static /* synthetic */ void a(com.beizi.ad.internal.a.a r0, com.beizi.fusion.events.EventBean r1) {
            r0.a(r1)
            return
    }

    private synchronized void a(com.beizi.fusion.events.EventBean r2) {
            r1 = this;
            monitor-enter(r1)
            android.content.Context r0 = com.beizi.ad.internal.a.a.f6536d     // Catch: java.lang.Throwable -> Lc
            com.beizi.fusion.events.EventCar r0 = com.beizi.fusion.events.EventCar.getInstance(r0)     // Catch: java.lang.Throwable -> Lc
            r0.goRoad(r2)     // Catch: java.lang.Throwable -> Lc
            monitor-exit(r1)
            return
        Lc:
            r2 = move-exception
            monitor-exit(r1)     // Catch: java.lang.Throwable -> Lc
            throw r2
    }

    private boolean a(java.util.LinkedList<com.beizi.ad.internal.a.b> r5, java.lang.String r6) {
            r4 = this;
            r0 = 0
            if (r5 == 0) goto L31
            boolean r1 = r5.isEmpty()     // Catch: java.lang.Exception -> L31
            if (r1 == 0) goto La
            goto L31
        La:
            java.lang.String r5 = r5.toString()     // Catch: java.lang.Exception -> L31
            java.lang.String r5 = com.beizi.ad.lance.a.b.a(r5)     // Catch: java.lang.Exception -> L31
            boolean r1 = android.text.TextUtils.isEmpty(r5)     // Catch: java.lang.Exception -> L31
            if (r1 == 0) goto L19
            return r0
        L19:
            android.content.Context r1 = com.beizi.ad.internal.a.a.f6536d     // Catch: java.lang.Exception -> L31
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch: java.lang.Exception -> L31
            r2.<init>()     // Catch: java.lang.Exception -> L31
            java.lang.String r3 = r4.f6537b     // Catch: java.lang.Exception -> L31
            r2.append(r3)     // Catch: java.lang.Exception -> L31
            r2.append(r6)     // Catch: java.lang.Exception -> L31
            java.lang.String r6 = r2.toString()     // Catch: java.lang.Exception -> L31
            com.beizi.ad.internal.h.m.a(r1, r6, r5)     // Catch: java.lang.Exception -> L31
            r5 = 1
            return r5
        L31:
            return r0
    }

    private void c(java.lang.String r4) {
            r3 = this;
            boolean r0 = android.text.TextUtils.isEmpty(r4)
            if (r0 == 0) goto L7
            return
        L7:
            r0 = 0
            com.beizi.ad.internal.h.i r0 = com.beizi.ad.internal.h.i.a(r0)
            com.beizi.ad.internal.a.a$4 r1 = new com.beizi.ad.internal.a.a$4
            r1.<init>(r3)
            r2 = 0
            r0.a(r4, r2, r1)
            return
    }

    private void d(java.lang.String r5) {
            r4 = this;
            boolean r0 = android.text.TextUtils.isEmpty(r5)
            if (r0 == 0) goto L7
            return
        L7:
            com.beizi.ad.internal.h.t r0 = com.beizi.ad.internal.h.t.a()
            android.content.Context r1 = com.beizi.ad.internal.a.a.f6536d
            com.beizi.ad.internal.a.a$5 r2 = new com.beizi.ad.internal.a.a$5
            r2.<init>(r4)
            r3 = 0
            r0.a(r1, r5, r3, r2)
            return
    }

    public com.beizi.ad.internal.f.c a(com.beizi.ad.internal.a.b r5, com.beizi.ad.internal.k r6) {
            r4 = this;
            r0 = 0
            if (r5 != 0) goto L4
            return r0
        L4:
            java.lang.String r1 = r5.a()     // Catch: java.lang.Exception -> L5b
            java.lang.String r5 = r5.d()     // Catch: java.lang.Exception -> L5b
            android.content.Context r2 = com.beizi.ad.internal.a.a.f6536d     // Catch: java.lang.Exception -> L5b
            java.lang.String r5 = com.beizi.ad.lance.a.h.a(r2, r1, r5)     // Catch: java.lang.Exception -> L5b
            boolean r2 = android.text.TextUtils.isEmpty(r5)     // Catch: java.lang.Exception -> L5b
            if (r2 == 0) goto L19
            return r0
        L19:
            com.beizi.ad.internal.f.c r2 = new com.beizi.ad.internal.f.c     // Catch: java.lang.Exception -> L5b
            r2.<init>(r5, r0, r6)     // Catch: java.lang.Exception -> L5b
            boolean r5 = r2.h()     // Catch: java.lang.Exception -> L5b
            if (r5 != 0) goto L25
            return r0
        L25:
            java.util.Map<java.lang.String, java.util.LinkedList<com.beizi.ad.internal.a.b>> r5 = com.beizi.ad.internal.a.a.f6535c     // Catch: java.lang.Exception -> L5b
            boolean r5 = r5.containsKey(r1)     // Catch: java.lang.Exception -> L5b
            if (r5 == 0) goto L36
            java.util.Map<java.lang.String, java.util.LinkedList<com.beizi.ad.internal.a.b>> r5 = com.beizi.ad.internal.a.a.f6535c     // Catch: java.lang.Exception -> L5b
            java.lang.Object r5 = r5.get(r1)     // Catch: java.lang.Exception -> L5b
            java.util.LinkedList r5 = (java.util.LinkedList) r5     // Catch: java.lang.Exception -> L5b
            goto L37
        L36:
            r5 = r0
        L37:
            if (r5 == 0) goto L44
            boolean r6 = r5.isEmpty()     // Catch: java.lang.Exception -> L5b
            if (r6 == 0) goto L40
            goto L44
        L40:
            r4.a(r5, r1)     // Catch: java.lang.Exception -> L5b
            return r2
        L44:
            android.content.Context r5 = com.beizi.ad.internal.a.a.f6536d     // Catch: java.lang.Exception -> L5b
            java.lang.StringBuilder r6 = new java.lang.StringBuilder     // Catch: java.lang.Exception -> L5b
            r6.<init>()     // Catch: java.lang.Exception -> L5b
            java.lang.String r3 = r4.f6537b     // Catch: java.lang.Exception -> L5b
            r6.append(r3)     // Catch: java.lang.Exception -> L5b
            r6.append(r1)     // Catch: java.lang.Exception -> L5b
            java.lang.String r6 = r6.toString()     // Catch: java.lang.Exception -> L5b
            com.beizi.ad.internal.h.m.c(r5, r6)     // Catch: java.lang.Exception -> L5b
            return r2
        L5b:
            return r0
    }

    public java.util.List<com.beizi.ad.internal.a.b> a(java.lang.String r14) {
            r13 = this;
            java.lang.String r0 = "requestId"
            java.lang.String r1 = "cacheTime"
            java.lang.String r2 = "spaceId"
            java.lang.String r3 = "expireTime"
            r4 = 0
            android.content.Context r5 = com.beizi.ad.internal.a.a.f6536d     // Catch: java.lang.Throwable -> La9
            java.lang.StringBuilder r6 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> La9
            r6.<init>()     // Catch: java.lang.Throwable -> La9
            java.lang.String r7 = r13.f6537b     // Catch: java.lang.Throwable -> La9
            r6.append(r7)     // Catch: java.lang.Throwable -> La9
            r6.append(r14)     // Catch: java.lang.Throwable -> La9
            java.lang.String r14 = r6.toString()     // Catch: java.lang.Throwable -> La9
            java.lang.String r14 = com.beizi.ad.internal.h.m.a(r5, r14)     // Catch: java.lang.Throwable -> La9
            boolean r5 = android.text.TextUtils.isEmpty(r14)     // Catch: java.lang.Throwable -> La9
            if (r5 == 0) goto L27
            return r4
        L27:
            java.lang.String r14 = com.beizi.ad.lance.a.b.b(r14)     // Catch: java.lang.Throwable -> La9
            boolean r5 = android.text.TextUtils.isEmpty(r14)     // Catch: java.lang.Throwable -> La9
            if (r5 == 0) goto L32
            return r4
        L32:
            org.json.JSONArray r5 = new org.json.JSONArray     // Catch: java.lang.Throwable -> La9
            r5.<init>(r14)     // Catch: java.lang.Throwable -> La9
            int r14 = r5.length()     // Catch: java.lang.Throwable -> La9
            r6 = 1
            if (r14 >= r6) goto L3f
            return r4
        L3f:
            r14 = 0
            r6 = r4
        L41:
            int r7 = r5.length()     // Catch: java.lang.Throwable -> La9
            if (r14 >= r7) goto La0
            org.json.JSONObject r7 = r5.optJSONObject(r14)     // Catch: java.lang.Throwable -> La9
            if (r7 != 0) goto L4e
            goto L9d
        L4e:
            boolean r8 = r7.has(r3)     // Catch: java.lang.Throwable -> La9
            if (r8 == 0) goto L59
            long r8 = r7.optLong(r3)     // Catch: java.lang.Throwable -> La9
            goto L5b
        L59:
            r8 = 0
        L5b:
            long r10 = java.lang.System.currentTimeMillis()     // Catch: java.lang.Throwable -> La9
            int r12 = (r8 > r10 ? 1 : (r8 == r10 ? 0 : -1))
            if (r12 >= 0) goto L64
            goto L9d
        L64:
            com.beizi.ad.internal.a.b r10 = new com.beizi.ad.internal.a.b     // Catch: java.lang.Throwable -> La9
            r10.<init>()     // Catch: java.lang.Throwable -> La9
            r10.b(r8)     // Catch: java.lang.Throwable -> La9
            boolean r8 = r7.has(r2)     // Catch: java.lang.Throwable -> La9
            if (r8 == 0) goto L79
            java.lang.String r8 = r7.optString(r2)     // Catch: java.lang.Throwable -> La9
            r10.a(r8)     // Catch: java.lang.Throwable -> La9
        L79:
            boolean r8 = r7.has(r1)     // Catch: java.lang.Throwable -> La9
            if (r8 == 0) goto L86
            long r8 = r7.optLong(r1)     // Catch: java.lang.Throwable -> La9
            r10.a(r8)     // Catch: java.lang.Throwable -> La9
        L86:
            boolean r8 = r7.has(r0)     // Catch: java.lang.Throwable -> La9
            if (r8 == 0) goto L93
            java.lang.String r7 = r7.optString(r0)     // Catch: java.lang.Throwable -> La9
            r10.b(r7)     // Catch: java.lang.Throwable -> La9
        L93:
            if (r6 != 0) goto L9a
            java.util.ArrayList r6 = new java.util.ArrayList     // Catch: java.lang.Throwable -> La9
            r6.<init>()     // Catch: java.lang.Throwable -> La9
        L9a:
            r6.add(r10)     // Catch: java.lang.Throwable -> La9
        L9d:
            int r14 = r14 + 1
            goto L41
        La0:
            com.beizi.ad.internal.a.a$1 r14 = new com.beizi.ad.internal.a.a$1     // Catch: java.lang.Throwable -> La9
            r14.<init>(r13)     // Catch: java.lang.Throwable -> La9
            java.util.Collections.sort(r6, r14)     // Catch: java.lang.Throwable -> La9
            return r6
        La9:
            return r4
    }

    public void a(com.beizi.ad.internal.a.b r3) {
            r2 = this;
            if (r3 != 0) goto L3
            goto L13
        L3:
            java.lang.System.currentTimeMillis()     // Catch: java.lang.Exception -> L13
            java.lang.String r0 = r3.a()     // Catch: java.lang.Exception -> L13
            java.lang.String r3 = r3.d()     // Catch: java.lang.Exception -> L13
            android.content.Context r1 = com.beizi.ad.internal.a.a.f6536d     // Catch: java.lang.Exception -> L13
            com.beizi.ad.lance.a.h.b(r1, r0, r3)     // Catch: java.lang.Exception -> L13
        L13:
            return
    }

    public void a(com.beizi.ad.internal.a.b r6, int r7, int r8) {
            r5 = this;
            if (r6 != 0) goto L3
            goto L57
        L3:
            long r0 = r6.c()     // Catch: java.lang.Throwable -> L57
            long r2 = java.lang.System.currentTimeMillis()     // Catch: java.lang.Throwable -> L57
            int r4 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r4 >= 0) goto L10
            goto L57
        L10:
            r0 = 1
            if (r7 == r0) goto L14
            goto L57
        L14:
            java.lang.String r7 = r6.a()     // Catch: java.lang.Throwable -> L57
            java.util.Map<java.lang.String, java.util.LinkedList<com.beizi.ad.internal.a.b>> r0 = com.beizi.ad.internal.a.a.f6535c     // Catch: java.lang.Throwable -> L57
            boolean r0 = r0.containsKey(r7)     // Catch: java.lang.Throwable -> L57
            if (r0 == 0) goto L29
            java.util.Map<java.lang.String, java.util.LinkedList<com.beizi.ad.internal.a.b>> r0 = com.beizi.ad.internal.a.a.f6535c     // Catch: java.lang.Throwable -> L57
            java.lang.Object r0 = r0.get(r7)     // Catch: java.lang.Throwable -> L57
            java.util.LinkedList r0 = (java.util.LinkedList) r0     // Catch: java.lang.Throwable -> L57
            goto L2a
        L29:
            r0 = 0
        L2a:
            if (r0 == 0) goto L32
            boolean r1 = r0.isEmpty()     // Catch: java.lang.Throwable -> L57
            if (r1 == 0) goto L37
        L32:
            java.util.LinkedList r0 = new java.util.LinkedList     // Catch: java.lang.Throwable -> L57
            r0.<init>()     // Catch: java.lang.Throwable -> L57
        L37:
            r0.add(r6)     // Catch: java.lang.Throwable -> L57
            com.beizi.ad.internal.a.a$2 r6 = new com.beizi.ad.internal.a.a$2     // Catch: java.lang.Throwable -> L57
            r6.<init>(r5)     // Catch: java.lang.Throwable -> L57
            java.util.Collections.sort(r0, r6)     // Catch: java.lang.Throwable -> L57
            int r6 = r0.size()     // Catch: java.lang.Throwable -> L57
            if (r6 <= r8) goto L4b
            r0.removeFirst()     // Catch: java.lang.Throwable -> L57
        L4b:
            boolean r6 = r5.a(r0, r7)     // Catch: java.lang.Throwable -> L57
            if (r6 != 0) goto L52
            goto L57
        L52:
            java.util.Map<java.lang.String, java.util.LinkedList<com.beizi.ad.internal.a.b>> r6 = com.beizi.ad.internal.a.a.f6535c     // Catch: java.lang.Throwable -> L57
            r6.put(r7, r0)     // Catch: java.lang.Throwable -> L57
        L57:
            return
    }

    public void a(com.beizi.ad.internal.f.c r6, java.lang.String r7, java.lang.String r8, java.lang.String r9, com.beizi.ad.internal.k r10) {
            r5 = this;
            boolean r0 = r6.h()     // Catch: java.lang.Exception -> Lc7
            if (r0 != 0) goto L8
            goto Lc7
        L8:
            int r0 = r6.V()     // Catch: java.lang.Exception -> Lc7
            if (r0 > 0) goto L10
            goto Lc7
        L10:
            android.content.Context r1 = com.beizi.ad.internal.a.a.f6536d     // Catch: java.lang.Exception -> Lc7
            boolean r7 = com.beizi.ad.lance.a.h.a(r1, r9, r8, r7)     // Catch: java.lang.Exception -> Lc7
            if (r7 != 0) goto L1a
            goto Lc7
        L1a:
            com.beizi.ad.internal.a.b r7 = new com.beizi.ad.internal.a.b     // Catch: java.lang.Exception -> Lc7
            r7.<init>()     // Catch: java.lang.Exception -> Lc7
            long r1 = java.lang.System.currentTimeMillis()     // Catch: java.lang.Exception -> Lc7
            r7.a(r1)     // Catch: java.lang.Exception -> Lc7
            int r0 = r0 * 1000
            long r3 = (long) r0     // Catch: java.lang.Exception -> Lc7
            long r1 = r1 + r3
            r7.b(r1)     // Catch: java.lang.Exception -> Lc7
            r7.b(r8)     // Catch: java.lang.Exception -> Lc7
            r7.a(r9)     // Catch: java.lang.Exception -> Lc7
            java.util.Map<java.lang.String, java.util.LinkedList<com.beizi.ad.internal.a.b>> r8 = com.beizi.ad.internal.a.a.f6535c     // Catch: java.lang.Exception -> Lc7
            boolean r8 = r8.containsKey(r9)     // Catch: java.lang.Exception -> Lc7
            if (r8 == 0) goto L44
            java.util.Map<java.lang.String, java.util.LinkedList<com.beizi.ad.internal.a.b>> r8 = com.beizi.ad.internal.a.a.f6535c     // Catch: java.lang.Exception -> Lc7
            java.lang.Object r8 = r8.get(r9)     // Catch: java.lang.Exception -> Lc7
            java.util.LinkedList r8 = (java.util.LinkedList) r8     // Catch: java.lang.Exception -> Lc7
            goto L45
        L44:
            r8 = 0
        L45:
            if (r8 == 0) goto L4d
            boolean r0 = r8.isEmpty()     // Catch: java.lang.Exception -> Lc7
            if (r0 == 0) goto L52
        L4d:
            java.util.LinkedList r8 = new java.util.LinkedList     // Catch: java.lang.Exception -> Lc7
            r8.<init>()     // Catch: java.lang.Exception -> Lc7
        L52:
            r8.add(r7)     // Catch: java.lang.Exception -> Lc7
            r5.a(r8, r9)     // Catch: java.lang.Exception -> Lc7
            java.util.Map<java.lang.String, java.util.LinkedList<com.beizi.ad.internal.a.b>> r7 = com.beizi.ad.internal.a.a.f6535c     // Catch: java.lang.Exception -> Lc7
            r7.put(r9, r8)     // Catch: java.lang.Exception -> Lc7
            int[] r7 = com.beizi.ad.internal.a.a.AnonymousClass6.a     // Catch: java.lang.Exception -> Lc7
            int r8 = r10.ordinal()     // Catch: java.lang.Exception -> Lc7
            r7 = r7[r8]     // Catch: java.lang.Exception -> Lc7
            r8 = 1
            if (r7 == r8) goto Lb8
            r8 = 2
            if (r7 == r8) goto Laa
            r8 = 3
            if (r7 == r8) goto L94
            r8 = 4
            if (r7 == r8) goto L72
            goto Lc7
        L72:
            boolean r7 = r6.N()     // Catch: java.lang.Exception -> Lc7
            if (r7 != 0) goto L79
            goto Lc7
        L79:
            java.lang.String r7 = r6.M()     // Catch: java.lang.Exception -> Lc7
            java.lang.String r6 = r6.X()     // Catch: java.lang.Exception -> Lc7
            boolean r8 = android.text.TextUtils.isEmpty(r7)     // Catch: java.lang.Exception -> Lc7
            if (r8 != 0) goto L8a
            r5.d(r7)     // Catch: java.lang.Exception -> Lc7
        L8a:
            boolean r7 = android.text.TextUtils.isEmpty(r6)     // Catch: java.lang.Exception -> Lc7
            if (r7 != 0) goto Lc7
            r5.c(r6)     // Catch: java.lang.Exception -> Lc7
            return
        L94:
            boolean r7 = r6.N()     // Catch: java.lang.Exception -> Lc7
            java.lang.String r8 = r6.L()     // Catch: java.lang.Exception -> Lc7
            java.lang.String r6 = r6.M()     // Catch: java.lang.Exception -> Lc7
            if (r7 == 0) goto La6
            r5.d(r6)     // Catch: java.lang.Exception -> Lc7
            return
        La6:
            r5.c(r8)     // Catch: java.lang.Exception -> Lc7
            return
        Laa:
            com.beizi.ad.i r6 = r6.a()     // Catch: java.lang.Exception -> Lc7
            com.beizi.ad.internal.e.a r6 = (com.beizi.ad.internal.e.a) r6     // Catch: java.lang.Exception -> Lc7
            java.lang.String r6 = r6.b()     // Catch: java.lang.Exception -> Lc7
            r5.c(r6)     // Catch: java.lang.Exception -> Lc7
            return
        Lb8:
            java.lang.String r7 = r6.S()     // Catch: java.lang.Exception -> Lc7
            com.beizi.ad.model.f$f r6 = r6.T()     // Catch: java.lang.Exception -> Lc7
            com.beizi.ad.model.f$f r8 = com.beizi.ad.model.f.EnumC0124f.f7458c     // Catch: java.lang.Exception -> Lc7
            if (r6 != r8) goto Lc7
            r5.c(r7)     // Catch: java.lang.Exception -> Lc7
        Lc7:
            return
    }

    public synchronized void a(com.beizi.fusion.events.EventBean r6, int r7, com.beizi.ad.model.b r8, com.beizi.ad.internal.k r9) {
            r5 = this;
            monitor-enter(r5)
            r0 = 1
            if (r7 < r0) goto L5b
            if (r8 != 0) goto L7
            goto L5b
        L7:
            java.lang.String r1 = r8.a()     // Catch: java.lang.Throwable -> L1c java.lang.Exception -> L59
            java.util.Map<java.lang.String, java.util.LinkedList<com.beizi.ad.internal.a.b>> r2 = com.beizi.ad.internal.a.a.f6535c     // Catch: java.lang.Throwable -> L1c java.lang.Exception -> L59
            boolean r2 = r2.containsKey(r1)     // Catch: java.lang.Throwable -> L1c java.lang.Exception -> L59
            if (r2 == 0) goto L1e
            java.util.Map<java.lang.String, java.util.LinkedList<com.beizi.ad.internal.a.b>> r2 = com.beizi.ad.internal.a.a.f6535c     // Catch: java.lang.Throwable -> L1c java.lang.Exception -> L59
            java.lang.Object r2 = r2.get(r1)     // Catch: java.lang.Throwable -> L1c java.lang.Exception -> L59
            java.util.LinkedList r2 = (java.util.LinkedList) r2     // Catch: java.lang.Throwable -> L1c java.lang.Exception -> L59
            goto L1f
        L1c:
            r6 = move-exception
            goto L57
        L1e:
            r2 = 0
        L1f:
            if (r2 == 0) goto L27
            boolean r3 = r2.isEmpty()     // Catch: java.lang.Throwable -> L1c java.lang.Exception -> L59
            if (r3 == 0) goto L3d
        L27:
            java.util.List r3 = r5.a(r1)     // Catch: java.lang.Throwable -> L1c java.lang.Exception -> L59
            if (r3 == 0) goto L3d
            int r4 = r3.size()     // Catch: java.lang.Throwable -> L1c java.lang.Exception -> L59
            if (r4 <= 0) goto L3d
            java.util.LinkedList r2 = new java.util.LinkedList     // Catch: java.lang.Throwable -> L1c java.lang.Exception -> L59
            r2.<init>(r3)     // Catch: java.lang.Throwable -> L1c java.lang.Exception -> L59
            java.util.Map<java.lang.String, java.util.LinkedList<com.beizi.ad.internal.a.b>> r3 = com.beizi.ad.internal.a.a.f6535c     // Catch: java.lang.Throwable -> L1c java.lang.Exception -> L59
            r3.put(r1, r2)     // Catch: java.lang.Throwable -> L1c java.lang.Exception -> L59
        L3d:
            if (r2 == 0) goto L4a
            int r1 = r2.size()     // Catch: java.lang.Throwable -> L1c java.lang.Exception -> L59
            if (r1 <= 0) goto L4a
            int r1 = r2.size()     // Catch: java.lang.Throwable -> L1c java.lang.Exception -> L59
            goto L4b
        L4a:
            r1 = 0
        L4b:
            if (r7 < r0) goto L55
            if (r1 < r7) goto L50
            goto L55
        L50:
            int r7 = r7 - r1
            r5.b(r6, r7, r8, r9)     // Catch: java.lang.Throwable -> L1c java.lang.Exception -> L59
            goto L59
        L55:
            monitor-exit(r5)
            return
        L57:
            monitor-exit(r5)     // Catch: java.lang.Throwable -> L1c
            throw r6
        L59:
            monitor-exit(r5)
            return
        L5b:
            monitor-exit(r5)
            return
    }

    public com.beizi.ad.internal.a.b b(java.lang.String r7) {
            r6 = this;
            r0 = 0
            java.util.Map<java.lang.String, java.util.LinkedList<com.beizi.ad.internal.a.b>> r1 = com.beizi.ad.internal.a.a.f6535c     // Catch: java.lang.Exception -> L51
            boolean r1 = r1.containsKey(r7)     // Catch: java.lang.Exception -> L51
            if (r1 == 0) goto L12
            java.util.Map<java.lang.String, java.util.LinkedList<com.beizi.ad.internal.a.b>> r1 = com.beizi.ad.internal.a.a.f6535c     // Catch: java.lang.Exception -> L51
            java.lang.Object r1 = r1.get(r7)     // Catch: java.lang.Exception -> L51
            java.util.LinkedList r1 = (java.util.LinkedList) r1     // Catch: java.lang.Exception -> L51
            goto L13
        L12:
            r1 = r0
        L13:
            if (r1 == 0) goto L1b
            boolean r2 = r1.isEmpty()     // Catch: java.lang.Exception -> L51
            if (r2 == 0) goto L33
        L1b:
            java.util.List r1 = r6.a(r7)     // Catch: java.lang.Exception -> L51
            if (r1 == 0) goto L51
            boolean r2 = r1.isEmpty()     // Catch: java.lang.Exception -> L51
            if (r2 == 0) goto L28
            goto L51
        L28:
            java.util.LinkedList r2 = new java.util.LinkedList     // Catch: java.lang.Exception -> L51
            r2.<init>(r1)     // Catch: java.lang.Exception -> L51
            java.util.Map<java.lang.String, java.util.LinkedList<com.beizi.ad.internal.a.b>> r1 = com.beizi.ad.internal.a.a.f6535c     // Catch: java.lang.Exception -> L51
            r1.put(r7, r2)     // Catch: java.lang.Exception -> L51
            r1 = r2
        L33:
            boolean r7 = r1.isEmpty()     // Catch: java.lang.Exception -> L51
            if (r7 == 0) goto L3a
            return r0
        L3a:
            java.lang.Object r7 = r1.pollLast()     // Catch: java.lang.Exception -> L51
            com.beizi.ad.internal.a.b r7 = (com.beizi.ad.internal.a.b) r7     // Catch: java.lang.Exception -> L51
            if (r7 != 0) goto L43
            return r0
        L43:
            long r1 = r7.c()     // Catch: java.lang.Exception -> L51
            long r3 = java.lang.System.currentTimeMillis()     // Catch: java.lang.Exception -> L51
            int r5 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r5 >= 0) goto L50
            return r0
        L50:
            return r7
        L51:
            return r0
    }

    public void b() {
            r1 = this;
            android.content.Context r0 = com.beizi.ad.internal.a.a.f6536d
            com.beizi.ad.lance.a.h.g(r0)
            return
    }

    public synchronized void b(com.beizi.fusion.events.EventBean r8, int r9, com.beizi.ad.model.b r10, com.beizi.ad.internal.k r11) {
            r7 = this;
            monitor-enter(r7)
            r0 = 1
            if (r9 >= r0) goto L6
            monitor-exit(r7)
            return
        L6:
            com.beizi.ad.lance.a.c r0 = com.beizi.ad.lance.a.c.b()     // Catch: java.lang.Throwable -> L20
            java.util.concurrent.ExecutorService r0 = r0.d()     // Catch: java.lang.Throwable -> L20
            com.beizi.ad.internal.a.a$3 r1 = new com.beizi.ad.internal.a.a$3     // Catch: java.lang.Throwable -> L20
            r2 = r7
            r4 = r8
            r3 = r9
            r5 = r10
            r6 = r11
            r1.<init>(r2, r3, r4, r5, r6)     // Catch: java.lang.Throwable -> L1d
            r0.execute(r1)     // Catch: java.lang.Throwable -> L1d
            monitor-exit(r7)
            return
        L1d:
            r0 = move-exception
        L1e:
            r8 = r0
            goto L23
        L20:
            r0 = move-exception
            r2 = r7
            goto L1e
        L23:
            monitor-exit(r7)     // Catch: java.lang.Throwable -> L1d
            throw r8
    }
}
