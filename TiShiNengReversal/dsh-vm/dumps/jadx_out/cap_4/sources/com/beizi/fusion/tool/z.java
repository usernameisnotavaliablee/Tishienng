package com.beizi.fusion.tool;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Volumes/前任肥胖/下载/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_4_sz9502280.dex */
public final class z {
    private static final java.lang.Object f = null;
    private static com.beizi.fusion.tool.z g;
    private final android.content.Context a;
    private final java.util.HashMap<android.content.BroadcastReceiver, java.util.ArrayList<com.beizi.fusion.tool.z.b>> b;
    private final java.util.HashMap<java.lang.String, java.util.ArrayList<com.beizi.fusion.tool.z.b>> c;
    private final java.util.ArrayList<com.beizi.fusion.tool.z.a> d;
    private final android.os.Handler e;


    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    private static final class a {
        final android.content.Intent a;
        final java.util.ArrayList<com.beizi.fusion.tool.z.b> b;

        a(android.content.Intent r1, java.util.ArrayList<com.beizi.fusion.tool.z.b> r2) {
                r0 = this;
                r0.<init>()
                r0.a = r1
                r0.b = r2
                return
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    private static final class b {
        final android.content.IntentFilter a;
        final android.content.BroadcastReceiver b;
        boolean c;
        boolean d;

        b(android.content.IntentFilter r1, android.content.BroadcastReceiver r2) {
                r0 = this;
                r0.<init>()
                r0.a = r1
                r0.b = r2
                return
        }

        public java.lang.String toString() {
                r2 = this;
                java.lang.StringBuilder r0 = new java.lang.StringBuilder
                r1 = 128(0x80, float:1.8E-43)
                r0.<init>(r1)
                java.lang.String r1 = "Receiver{"
                r0.append(r1)
                android.content.BroadcastReceiver r1 = r2.b
                r0.append(r1)
                java.lang.String r1 = " filter="
                r0.append(r1)
                android.content.IntentFilter r1 = r2.a
                r0.append(r1)
                boolean r1 = r2.d
                if (r1 == 0) goto L24
                java.lang.String r1 = " DEAD"
                r0.append(r1)
            L24:
                java.lang.String r1 = "}"
                r0.append(r1)
                java.lang.String r0 = r0.toString()
                return r0
        }
    }

    static {
            java.lang.Object r0 = new java.lang.Object
            r0.<init>()
            com.beizi.fusion.tool.z.f = r0
            return
    }

    private z(android.content.Context r2) {
            r1 = this;
            r1.<init>()
            java.util.HashMap r0 = new java.util.HashMap
            r0.<init>()
            r1.b = r0
            java.util.HashMap r0 = new java.util.HashMap
            r0.<init>()
            r1.c = r0
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            r1.d = r0
            r1.a = r2
            com.beizi.fusion.tool.z$1 r0 = new com.beizi.fusion.tool.z$1
            android.os.Looper r2 = r2.getMainLooper()
            r0.<init>(r1, r2)
            r1.e = r0
            return
    }

    @androidx.annotation.NonNull
    public static com.beizi.fusion.tool.z a(@androidx.annotation.NonNull android.content.Context r2) {
            java.lang.Object r0 = com.beizi.fusion.tool.z.f
            monitor-enter(r0)
            com.beizi.fusion.tool.z r1 = com.beizi.fusion.tool.z.g     // Catch: java.lang.Throwable -> L17
            if (r1 != 0) goto L19
            com.beizi.fusion.tool.z r1 = new com.beizi.fusion.tool.z     // Catch: java.lang.Throwable -> L17
            android.content.Context r2 = r2.getApplicationContext()     // Catch: java.lang.Throwable -> L17
            android.content.Context r2 = com.stub.StubApp.getOrigApplicationContext(r2)     // Catch: java.lang.Throwable -> L17
            r1.<init>(r2)     // Catch: java.lang.Throwable -> L17
            com.beizi.fusion.tool.z.g = r1     // Catch: java.lang.Throwable -> L17
            goto L19
        L17:
            r2 = move-exception
            goto L1d
        L19:
            com.beizi.fusion.tool.z r2 = com.beizi.fusion.tool.z.g     // Catch: java.lang.Throwable -> L17
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L17
            return r2
        L1d:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L17
            throw r2
    }

    private void a() {
            r10 = this;
        L0:
            java.util.HashMap<android.content.BroadcastReceiver, java.util.ArrayList<com.beizi.fusion.tool.z$b>> r0 = r10.b
            monitor-enter(r0)
            java.util.ArrayList<com.beizi.fusion.tool.z$a> r1 = r10.d     // Catch: java.lang.Throwable -> Ld
            int r1 = r1.size()     // Catch: java.lang.Throwable -> Ld
            if (r1 > 0) goto Lf
            monitor-exit(r0)     // Catch: java.lang.Throwable -> Ld
            return
        Ld:
            r1 = move-exception
            goto L46
        Lf:
            com.beizi.fusion.tool.z$a[] r2 = new com.beizi.fusion.tool.z.a[r1]     // Catch: java.lang.Throwable -> Ld
            java.util.ArrayList<com.beizi.fusion.tool.z$a> r3 = r10.d     // Catch: java.lang.Throwable -> Ld
            r3.toArray(r2)     // Catch: java.lang.Throwable -> Ld
            java.util.ArrayList<com.beizi.fusion.tool.z$a> r3 = r10.d     // Catch: java.lang.Throwable -> Ld
            r3.clear()     // Catch: java.lang.Throwable -> Ld
            monitor-exit(r0)     // Catch: java.lang.Throwable -> Ld
            r0 = 0
            r3 = 0
        L1e:
            if (r3 >= r1) goto L0
            r4 = r2[r3]
            java.util.ArrayList<com.beizi.fusion.tool.z$b> r5 = r4.b
            int r5 = r5.size()
            r6 = 0
        L29:
            if (r6 >= r5) goto L43
            java.util.ArrayList<com.beizi.fusion.tool.z$b> r7 = r4.b
            java.lang.Object r7 = r7.get(r6)
            com.beizi.fusion.tool.z$b r7 = (com.beizi.fusion.tool.z.b) r7
            boolean r8 = r7.d
            if (r8 != 0) goto L40
            android.content.BroadcastReceiver r7 = r7.b
            android.content.Context r8 = r10.a
            android.content.Intent r9 = r4.a
            r7.onReceive(r8, r9)
        L40:
            int r6 = r6 + 1
            goto L29
        L43:
            int r3 = r3 + 1
            goto L1e
        L46:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> Ld
            throw r1
    }

    static /* synthetic */ void a(com.beizi.fusion.tool.z r0) {
            r0.a()
            return
    }

    public void a(@androidx.annotation.NonNull android.content.BroadcastReceiver r12) {
            r11 = this;
            java.util.HashMap<android.content.BroadcastReceiver, java.util.ArrayList<com.beizi.fusion.tool.z$b>> r0 = r11.b
            monitor-enter(r0)
            java.util.HashMap<android.content.BroadcastReceiver, java.util.ArrayList<com.beizi.fusion.tool.z$b>> r1 = r11.b     // Catch: java.lang.Throwable -> Lf java.lang.Exception -> L64
            java.lang.Object r1 = r1.remove(r12)     // Catch: java.lang.Throwable -> Lf java.lang.Exception -> L64
            java.util.ArrayList r1 = (java.util.ArrayList) r1     // Catch: java.lang.Throwable -> Lf java.lang.Exception -> L64
            if (r1 != 0) goto L11
            monitor-exit(r0)     // Catch: java.lang.Throwable -> Lf
            return
        Lf:
            r12 = move-exception
            goto L66
        L11:
            int r2 = r1.size()     // Catch: java.lang.Throwable -> Lf java.lang.Exception -> L64
            r3 = 1
            int r2 = r2 - r3
        L17:
            if (r2 < 0) goto L64
            java.lang.Object r4 = r1.get(r2)     // Catch: java.lang.Throwable -> Lf java.lang.Exception -> L64
            com.beizi.fusion.tool.z$b r4 = (com.beizi.fusion.tool.z.b) r4     // Catch: java.lang.Throwable -> Lf java.lang.Exception -> L64
            r4.d = r3     // Catch: java.lang.Throwable -> Lf java.lang.Exception -> L64
            r5 = 0
        L22:
            android.content.IntentFilter r6 = r4.a     // Catch: java.lang.Throwable -> Lf java.lang.Exception -> L64
            int r6 = r6.countActions()     // Catch: java.lang.Throwable -> Lf java.lang.Exception -> L64
            if (r5 >= r6) goto L61
            android.content.IntentFilter r6 = r4.a     // Catch: java.lang.Throwable -> Lf java.lang.Exception -> L64
            java.lang.String r6 = r6.getAction(r5)     // Catch: java.lang.Throwable -> Lf java.lang.Exception -> L64
            java.util.HashMap<java.lang.String, java.util.ArrayList<com.beizi.fusion.tool.z$b>> r7 = r11.c     // Catch: java.lang.Throwable -> Lf java.lang.Exception -> L64
            java.lang.Object r7 = r7.get(r6)     // Catch: java.lang.Throwable -> Lf java.lang.Exception -> L64
            java.util.ArrayList r7 = (java.util.ArrayList) r7     // Catch: java.lang.Throwable -> Lf java.lang.Exception -> L64
            if (r7 == 0) goto L5e
            int r8 = r7.size()     // Catch: java.lang.Throwable -> Lf java.lang.Exception -> L64
            int r8 = r8 - r3
        L3f:
            if (r8 < 0) goto L53
            java.lang.Object r9 = r7.get(r8)     // Catch: java.lang.Throwable -> Lf java.lang.Exception -> L64
            com.beizi.fusion.tool.z$b r9 = (com.beizi.fusion.tool.z.b) r9     // Catch: java.lang.Throwable -> Lf java.lang.Exception -> L64
            android.content.BroadcastReceiver r10 = r9.b     // Catch: java.lang.Throwable -> Lf java.lang.Exception -> L64
            if (r10 != r12) goto L50
            r9.d = r3     // Catch: java.lang.Throwable -> Lf java.lang.Exception -> L64
            r7.remove(r8)     // Catch: java.lang.Throwable -> Lf java.lang.Exception -> L64
        L50:
            int r8 = r8 + (-1)
            goto L3f
        L53:
            int r7 = r7.size()     // Catch: java.lang.Throwable -> Lf java.lang.Exception -> L64
            if (r7 > 0) goto L5e
            java.util.HashMap<java.lang.String, java.util.ArrayList<com.beizi.fusion.tool.z$b>> r7 = r11.c     // Catch: java.lang.Throwable -> Lf java.lang.Exception -> L64
            r7.remove(r6)     // Catch: java.lang.Throwable -> Lf java.lang.Exception -> L64
        L5e:
            int r5 = r5 + 1
            goto L22
        L61:
            int r2 = r2 + (-1)
            goto L17
        L64:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> Lf
            return
        L66:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> Lf
            throw r12
    }

    public void a(@androidx.annotation.NonNull android.content.BroadcastReceiver r7, @androidx.annotation.NonNull android.content.IntentFilter r8) {
            r6 = this;
            java.util.HashMap<android.content.BroadcastReceiver, java.util.ArrayList<com.beizi.fusion.tool.z$b>> r0 = r6.b
            monitor-enter(r0)
            com.beizi.fusion.tool.z$b r1 = new com.beizi.fusion.tool.z$b     // Catch: java.lang.Throwable -> L1e java.lang.Exception -> L48
            r1.<init>(r8, r7)     // Catch: java.lang.Throwable -> L1e java.lang.Exception -> L48
            java.util.HashMap<android.content.BroadcastReceiver, java.util.ArrayList<com.beizi.fusion.tool.z$b>> r2 = r6.b     // Catch: java.lang.Throwable -> L1e java.lang.Exception -> L48
            java.lang.Object r2 = r2.get(r7)     // Catch: java.lang.Throwable -> L1e java.lang.Exception -> L48
            java.util.ArrayList r2 = (java.util.ArrayList) r2     // Catch: java.lang.Throwable -> L1e java.lang.Exception -> L48
            r3 = 1
            if (r2 != 0) goto L20
            java.util.ArrayList r2 = new java.util.ArrayList     // Catch: java.lang.Throwable -> L1e java.lang.Exception -> L48
            r2.<init>(r3)     // Catch: java.lang.Throwable -> L1e java.lang.Exception -> L48
            java.util.HashMap<android.content.BroadcastReceiver, java.util.ArrayList<com.beizi.fusion.tool.z$b>> r4 = r6.b     // Catch: java.lang.Throwable -> L1e java.lang.Exception -> L48
            r4.put(r7, r2)     // Catch: java.lang.Throwable -> L1e java.lang.Exception -> L48
            goto L20
        L1e:
            r7 = move-exception
            goto L4a
        L20:
            r2.add(r1)     // Catch: java.lang.Throwable -> L1e java.lang.Exception -> L48
            r7 = 0
        L24:
            int r2 = r8.countActions()     // Catch: java.lang.Throwable -> L1e java.lang.Exception -> L48
            if (r7 >= r2) goto L48
            java.lang.String r2 = r8.getAction(r7)     // Catch: java.lang.Throwable -> L1e java.lang.Exception -> L48
            java.util.HashMap<java.lang.String, java.util.ArrayList<com.beizi.fusion.tool.z$b>> r4 = r6.c     // Catch: java.lang.Throwable -> L1e java.lang.Exception -> L48
            java.lang.Object r4 = r4.get(r2)     // Catch: java.lang.Throwable -> L1e java.lang.Exception -> L48
            java.util.ArrayList r4 = (java.util.ArrayList) r4     // Catch: java.lang.Throwable -> L1e java.lang.Exception -> L48
            if (r4 != 0) goto L42
            java.util.ArrayList r4 = new java.util.ArrayList     // Catch: java.lang.Throwable -> L1e java.lang.Exception -> L48
            r4.<init>(r3)     // Catch: java.lang.Throwable -> L1e java.lang.Exception -> L48
            java.util.HashMap<java.lang.String, java.util.ArrayList<com.beizi.fusion.tool.z$b>> r5 = r6.c     // Catch: java.lang.Throwable -> L1e java.lang.Exception -> L48
            r5.put(r2, r4)     // Catch: java.lang.Throwable -> L1e java.lang.Exception -> L48
        L42:
            r4.add(r1)     // Catch: java.lang.Throwable -> L1e java.lang.Exception -> L48
            int r7 = r7 + 1
            goto L24
        L48:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L1e
            return
        L4a:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L1e
            throw r7
    }

    public boolean a(@androidx.annotation.NonNull android.content.Intent r19) {
            r18 = this;
            r1 = r18
            r0 = r19
            java.util.HashMap<android.content.BroadcastReceiver, java.util.ArrayList<com.beizi.fusion.tool.z$b>> r2 = r1.b
            monitor-enter(r2)
            java.lang.String r5 = r0.getAction()     // Catch: java.lang.Throwable -> L33 java.lang.Exception -> Lb6
            android.content.Context r4 = r1.a     // Catch: java.lang.Throwable -> L33 java.lang.Exception -> Lb6
            android.content.ContentResolver r4 = r4.getContentResolver()     // Catch: java.lang.Throwable -> L33 java.lang.Exception -> Lb6
            java.lang.String r6 = r0.resolveTypeIfNeeded(r4)     // Catch: java.lang.Throwable -> L33 java.lang.Exception -> Lb6
            android.net.Uri r8 = r0.getData()     // Catch: java.lang.Throwable -> L33 java.lang.Exception -> Lb6
            java.lang.String r7 = r0.getScheme()     // Catch: java.lang.Throwable -> L33 java.lang.Exception -> Lb6
            java.util.Set r9 = r0.getCategories()     // Catch: java.lang.Throwable -> L33 java.lang.Exception -> Lb6
            int r4 = r0.getFlags()     // Catch: java.lang.Throwable -> L33 java.lang.Exception -> Lb6
            r4 = r4 & 8
            r11 = 1
            if (r4 == 0) goto L2c
            r12 = 1
            goto L2d
        L2c:
            r12 = 0
        L2d:
            if (r12 == 0) goto L36
            r0.toString()     // Catch: java.lang.Throwable -> L33 java.lang.Exception -> Lb6
            goto L36
        L33:
            r0 = move-exception
            goto Lba
        L36:
            java.util.HashMap<java.lang.String, java.util.ArrayList<com.beizi.fusion.tool.z$b>> r4 = r1.c     // Catch: java.lang.Throwable -> L33 java.lang.Exception -> Lb6
            java.lang.String r10 = r0.getAction()     // Catch: java.lang.Throwable -> L33 java.lang.Exception -> Lb6
            java.lang.Object r4 = r4.get(r10)     // Catch: java.lang.Throwable -> L33 java.lang.Exception -> Lb6
            r13 = r4
            java.util.ArrayList r13 = (java.util.ArrayList) r13     // Catch: java.lang.Throwable -> L33 java.lang.Exception -> Lb6
            if (r13 == 0) goto Lb6
            if (r12 == 0) goto L4a
            r13.toString()     // Catch: java.lang.Throwable -> L33 java.lang.Exception -> Lb6
        L4a:
            r4 = 0
            r14 = r4
            r15 = 0
        L4d:
            int r4 = r13.size()     // Catch: java.lang.Throwable -> L33 java.lang.Exception -> Lb6
            if (r15 >= r4) goto L88
            java.lang.Object r4 = r13.get(r15)     // Catch: java.lang.Throwable -> L33 java.lang.Exception -> Lb6
            com.beizi.fusion.tool.z$b r4 = (com.beizi.fusion.tool.z.b) r4     // Catch: java.lang.Throwable -> L33 java.lang.Exception -> Lb6
            if (r12 == 0) goto L60
            android.content.IntentFilter r10 = r4.a     // Catch: java.lang.Throwable -> L33 java.lang.Exception -> Lb6
            java.util.Objects.toString(r10)     // Catch: java.lang.Throwable -> L33 java.lang.Exception -> Lb6
        L60:
            boolean r10 = r4.c     // Catch: java.lang.Throwable -> L33 java.lang.Exception -> Lb6
            if (r10 == 0) goto L65
            goto L85
        L65:
            r10 = r4
            android.content.IntentFilter r4 = r10.a     // Catch: java.lang.Throwable -> L33 java.lang.Exception -> Lb6
            r16 = r10
            java.lang.String r10 = "LocalBroadcastManager"
            r3 = r16
            int r4 = r4.match(r5, r6, r7, r8, r9, r10)     // Catch: java.lang.Throwable -> L33 java.lang.Exception -> Lb6
            if (r4 < 0) goto L85
            if (r12 == 0) goto L79
            java.lang.Integer.toHexString(r4)     // Catch: java.lang.Throwable -> L33 java.lang.Exception -> Lb6
        L79:
            if (r14 != 0) goto L80
            java.util.ArrayList r14 = new java.util.ArrayList     // Catch: java.lang.Throwable -> L33 java.lang.Exception -> Lb6
            r14.<init>()     // Catch: java.lang.Throwable -> L33 java.lang.Exception -> Lb6
        L80:
            r14.add(r3)     // Catch: java.lang.Throwable -> L33 java.lang.Exception -> Lb6
            r3.c = r11     // Catch: java.lang.Throwable -> L33 java.lang.Exception -> Lb6
        L85:
            int r15 = r15 + 1
            goto L4d
        L88:
            if (r14 == 0) goto Lb6
            r3 = 0
        L8b:
            int r4 = r14.size()     // Catch: java.lang.Throwable -> L33 java.lang.Exception -> Lb6
            if (r3 >= r4) goto L9d
            java.lang.Object r4 = r14.get(r3)     // Catch: java.lang.Throwable -> L33 java.lang.Exception -> Lb6
            com.beizi.fusion.tool.z$b r4 = (com.beizi.fusion.tool.z.b) r4     // Catch: java.lang.Throwable -> L33 java.lang.Exception -> Lb6
            r5 = 0
            r4.c = r5     // Catch: java.lang.Throwable -> L33 java.lang.Exception -> Lb6
            int r3 = r3 + 1
            goto L8b
        L9d:
            java.util.ArrayList<com.beizi.fusion.tool.z$a> r3 = r1.d     // Catch: java.lang.Throwable -> L33 java.lang.Exception -> Lb6
            com.beizi.fusion.tool.z$a r4 = new com.beizi.fusion.tool.z$a     // Catch: java.lang.Throwable -> L33 java.lang.Exception -> Lb6
            r4.<init>(r0, r14)     // Catch: java.lang.Throwable -> L33 java.lang.Exception -> Lb6
            r3.add(r4)     // Catch: java.lang.Throwable -> L33 java.lang.Exception -> Lb6
            android.os.Handler r0 = r1.e     // Catch: java.lang.Throwable -> L33 java.lang.Exception -> Lb6
            boolean r0 = r0.hasMessages(r11)     // Catch: java.lang.Throwable -> L33 java.lang.Exception -> Lb6
            if (r0 != 0) goto Lb4
            android.os.Handler r0 = r1.e     // Catch: java.lang.Throwable -> L33 java.lang.Exception -> Lb6
            r0.sendEmptyMessage(r11)     // Catch: java.lang.Throwable -> L33 java.lang.Exception -> Lb6
        Lb4:
            monitor-exit(r2)     // Catch: java.lang.Throwable -> L33
            return r11
        Lb6:
            monitor-exit(r2)     // Catch: java.lang.Throwable -> L33
            r17 = 0
            return r17
        Lba:
            monitor-exit(r2)     // Catch: java.lang.Throwable -> L33
            throw r0
    }
}
