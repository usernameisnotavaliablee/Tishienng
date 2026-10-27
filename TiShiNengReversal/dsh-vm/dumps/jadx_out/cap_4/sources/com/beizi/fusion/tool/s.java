package com.beizi.fusion.tool;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Volumes/前任肥胖/下载/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_4_sz9502280.dex */
public class s {
    private static java.util.HashMap<java.lang.String, java.lang.Object> a;
    private static java.util.HashMap<java.lang.String, java.lang.Object> b;
    private static java.util.Comparator<com.beizi.fusion.model.EventItem> c;
    private static java.util.HashMap<java.lang.String, java.lang.Long> d;
    private static java.util.HashMap<java.lang.String, com.beizi.fusion.model.FreqItem> e;
    private static java.util.HashSet<java.lang.String> f;



    static {
            java.util.HashMap r0 = new java.util.HashMap
            r0.<init>()
            com.beizi.fusion.tool.s.a = r0
            java.util.HashMap r0 = new java.util.HashMap
            r0.<init>()
            com.beizi.fusion.tool.s.b = r0
            com.beizi.fusion.tool.s$1 r0 = new com.beizi.fusion.tool.s$1
            r0.<init>()
            com.beizi.fusion.tool.s.c = r0
            java.util.HashMap r0 = new java.util.HashMap
            r0.<init>()
            com.beizi.fusion.tool.s.d = r0
            java.util.HashMap r0 = new java.util.HashMap
            r0.<init>()
            com.beizi.fusion.tool.s.e = r0
            java.util.HashSet r0 = new java.util.HashSet
            r0.<init>()
            com.beizi.fusion.tool.s.f = r0
            return
    }

    public s() {
            r1 = this;
            r1.<init>()
            return
    }

    public static int a(java.lang.String r8, java.lang.String r9) {
            r0 = 0
            if (r9 != 0) goto L4
            return r0
        L4:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "enter getTodayEventTimes channelMap != null ?  "
            r1.append(r2)
            java.util.HashMap<java.lang.String, java.lang.Object> r2 = com.beizi.fusion.tool.s.b
            if (r2 == 0) goto L14
            r2 = 1
            goto L15
        L14:
            r2 = 0
        L15:
            r1.append(r2)
            java.lang.String r2 = ",eventCode = "
            r1.append(r2)
            r1.append(r9)
            java.lang.String r1 = r1.toString()
            d(r1)
            com.beizi.fusion.c.b r1 = com.beizi.fusion.c.b.a()
            android.content.Context r1 = r1.e()
            b(r1, r8)
            long r3 = a()
            java.lang.String r1 = java.lang.String.valueOf(r3)
            java.lang.String r3 = "200.000"
            boolean r3 = r3.equalsIgnoreCase(r9)
            java.lang.String r4 = "BeiZis"
            if (r3 == 0) goto L97
            java.util.HashMap<java.lang.String, java.lang.Object> r2 = com.beizi.fusion.tool.s.a
            if (r2 == 0) goto L14b
            java.lang.Object r2 = r2.get(r8)
            if (r2 == 0) goto L14b
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r3 = "getSpaceTodayEventTimes platFormMap.containsKey(adUnitId) = "
            r2.append(r3)
            java.util.HashMap<java.lang.String, java.lang.Object> r3 = com.beizi.fusion.tool.s.a
            boolean r3 = r3.containsKey(r8)
            r2.append(r3)
            java.lang.String r2 = r2.toString()
            d(r2)
            java.util.HashMap<java.lang.String, java.lang.Object> r2 = com.beizi.fusion.tool.s.a
            java.lang.Object r8 = r2.get(r8)
            java.util.HashMap r8 = (java.util.HashMap) r8
            if (r8 == 0) goto L14b
            java.lang.Object r8 = r8.get(r9)
            java.util.ArrayList r8 = (java.util.ArrayList) r8
            if (r8 == 0) goto L14b
            java.util.Iterator r8 = r8.iterator()
        L7e:
            boolean r9 = r8.hasNext()
            if (r9 == 0) goto L14b
            java.lang.Object r9 = r8.next()
            com.beizi.fusion.model.EventItem r9 = (com.beizi.fusion.model.EventItem) r9
            java.lang.String r9 = r9.getTimeStamp()
            int r9 = r9.compareTo(r1)
            if (r9 <= 0) goto L7e
            int r0 = r0 + 1
            goto L7e
        L97:
            java.util.HashMap<java.lang.String, java.lang.Object> r3 = com.beizi.fusion.tool.s.b
            if (r3 == 0) goto L14b
            java.lang.Object r3 = r3.get(r8)
            if (r3 == 0) goto L14b
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            java.lang.String r5 = "getSpaceTodayEventTimes channelMap.containsKey(adUnitId) = "
            r3.append(r5)
            java.util.HashMap<java.lang.String, java.lang.Object> r5 = com.beizi.fusion.tool.s.b
            boolean r5 = r5.containsKey(r8)
            r3.append(r5)
            java.lang.String r3 = r3.toString()
            d(r3)
            java.util.HashMap<java.lang.String, java.lang.Object> r3 = com.beizi.fusion.tool.s.b
            java.lang.Object r8 = r3.get(r8)
            java.util.HashMap r8 = (java.util.HashMap) r8
            java.util.HashSet<java.lang.String> r3 = com.beizi.fusion.tool.s.f
            java.util.Iterator r3 = r3.iterator()
        Lc9:
            boolean r5 = r3.hasNext()
            if (r5 == 0) goto L14b
            java.lang.Object r5 = r3.next()
            java.lang.String r5 = (java.lang.String) r5
            if (r8 == 0) goto Lc9
            java.lang.Object r6 = r8.get(r5)
            if (r6 == 0) goto Lc9
            java.lang.Object r5 = r8.get(r5)
            java.util.HashMap r5 = (java.util.HashMap) r5
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            r6.<init>()
            java.lang.String r7 = "getSpaceTodayEventTimes eventMap = "
            r6.append(r7)
            r6.append(r5)
            java.lang.String r6 = r6.toString()
            d(r6)
            if (r5 == 0) goto Lc9
            java.lang.Object r6 = r5.get(r9)
            if (r6 == 0) goto Lc9
            java.lang.Object r5 = r5.get(r9)
            java.util.ArrayList r5 = (java.util.ArrayList) r5
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            r6.<init>()
            java.lang.String r7 = "getSpaceTodayEventTimes itemList = "
            r6.append(r7)
            r6.append(r5)
            r6.append(r2)
            r6.append(r9)
            java.lang.String r6 = r6.toString()
            d(r6)
            if (r5 == 0) goto Lc9
            int r6 = r5.size()
            if (r6 <= 0) goto Lc9
            java.lang.String r6 = r5.toString()
            com.beizi.fusion.tool.aa.c(r4, r6)
            java.util.Iterator r5 = r5.iterator()
        L132:
            boolean r6 = r5.hasNext()
            if (r6 == 0) goto Lc9
            java.lang.Object r6 = r5.next()
            com.beizi.fusion.model.EventItem r6 = (com.beizi.fusion.model.EventItem) r6
            java.lang.String r6 = r6.getTimeStamp()
            int r6 = r6.compareTo(r1)
            if (r6 <= 0) goto L132
            int r0 = r0 + 1
            goto L132
        L14b:
            java.lang.StringBuilder r8 = new java.lang.StringBuilder
            r8.<init>()
            java.lang.String r9 = "todayEventTimes = "
            r8.append(r9)
            r8.append(r0)
            java.lang.String r8 = r8.toString()
            com.beizi.fusion.tool.aa.c(r4, r8)
            return r0
    }

    public static long a() {
            java.util.Locale r0 = java.util.Locale.CHINA
            java.util.Calendar r0 = java.util.Calendar.getInstance(r0)
            r1 = 11
            r2 = 0
            r0.set(r1, r2)
            r1 = 12
            r0.set(r1, r2)
            r1 = 13
            r0.set(r1, r2)
            long r0 = r0.getTimeInMillis()
            return r0
    }

    private static java.util.Map<java.lang.String, java.util.List<com.beizi.fusion.model.EventItem>> a(java.util.List<com.beizi.fusion.model.EventItem> r6) {
            if (r6 == 0) goto L7c
            int r0 = r6.size()
            if (r0 != 0) goto La
            goto L7c
        La:
            java.util.HashMap r0 = new java.util.HashMap
            r0.<init>()
            java.util.Iterator r6 = r6.iterator()
            r1 = 0
            r2 = r1
        L15:
            boolean r3 = r6.hasNext()
            if (r3 == 0) goto L58
            java.lang.Object r3 = r6.next()
            com.beizi.fusion.model.EventItem r3 = (com.beizi.fusion.model.EventItem) r3
            java.lang.String r4 = r3.getCode()
            boolean r5 = r4.equals(r1)
            if (r5 == 0) goto L31
            if (r2 == 0) goto L56
            r2.add(r3)
            goto L56
        L31:
            if (r1 == 0) goto L38
            if (r2 == 0) goto L38
            r0.put(r1, r2)
        L38:
            boolean r1 = r0.containsKey(r4)
            if (r1 != 0) goto L47
            java.util.ArrayList r1 = new java.util.ArrayList
            r1.<init>()
            r1.add(r3)
            goto L52
        L47:
            java.lang.Object r1 = r0.get(r4)
            java.util.ArrayList r1 = (java.util.ArrayList) r1
            if (r1 == 0) goto L52
            r1.add(r3)
        L52:
            r0.put(r4, r1)
            r2 = r1
        L56:
            r1 = r4
            goto L15
        L58:
            java.util.Set r6 = r0.keySet()
            java.util.Iterator r6 = r6.iterator()
        L60:
            boolean r1 = r6.hasNext()
            if (r1 == 0) goto L7b
            java.lang.Object r1 = r6.next()
            java.lang.String r1 = (java.lang.String) r1
            java.lang.Object r2 = r0.get(r1)
            java.util.ArrayList r2 = (java.util.ArrayList) r2
            java.util.Comparator<com.beizi.fusion.model.EventItem> r3 = com.beizi.fusion.tool.s.c
            java.util.Collections.sort(r2, r3)
            r0.put(r1, r2)
            goto L60
        L7b:
            return r0
        L7c:
            java.util.HashMap r6 = new java.util.HashMap
            r6.<init>()
            return r6
    }

    public static void a(android.content.Context r2, java.lang.String r3) {
            com.beizi.fusion.a.b r2 = com.beizi.fusion.a.b.a(r2)     // Catch: java.lang.Exception -> L4c
            java.util.List r2 = r2.a(r3)     // Catch: java.lang.Exception -> L4c
            java.util.ArrayList r2 = (java.util.ArrayList) r2     // Catch: java.lang.Exception -> L4c
            java.util.HashMap<java.lang.String, java.lang.Object> r0 = com.beizi.fusion.tool.s.a     // Catch: java.lang.Exception -> L4c
            java.util.Map r1 = a(r2)     // Catch: java.lang.Exception -> L4c
            r0.put(r3, r1)     // Catch: java.lang.Exception -> L4c
            java.util.HashMap<java.lang.String, java.lang.Object> r0 = com.beizi.fusion.tool.s.b     // Catch: java.lang.Exception -> L4c
            java.util.Map r2 = b(r2)     // Catch: java.lang.Exception -> L4c
            r0.put(r3, r2)     // Catch: java.lang.Exception -> L4c
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch: java.lang.Exception -> L4c
            r2.<init>()     // Catch: java.lang.Exception -> L4c
            java.lang.String r0 = "adUnitId = "
            r2.append(r0)     // Catch: java.lang.Exception -> L4c
            r2.append(r3)     // Catch: java.lang.Exception -> L4c
            java.lang.String r0 = ",platFormMap get = "
            r2.append(r0)     // Catch: java.lang.Exception -> L4c
            java.util.HashMap<java.lang.String, java.lang.Object> r0 = com.beizi.fusion.tool.s.a     // Catch: java.lang.Exception -> L4c
            java.lang.Object r0 = r0.get(r3)     // Catch: java.lang.Exception -> L4c
            r2.append(r0)     // Catch: java.lang.Exception -> L4c
            java.lang.String r0 = ",channelMap get = "
            r2.append(r0)     // Catch: java.lang.Exception -> L4c
            java.util.HashMap<java.lang.String, java.lang.Object> r0 = com.beizi.fusion.tool.s.b     // Catch: java.lang.Exception -> L4c
            java.lang.Object r3 = r0.get(r3)     // Catch: java.lang.Exception -> L4c
            r2.append(r3)     // Catch: java.lang.Exception -> L4c
            java.lang.String r2 = r2.toString()     // Catch: java.lang.Exception -> L4c
            d(r2)     // Catch: java.lang.Exception -> L4c
        L4c:
            return
    }

    private static void a(com.beizi.fusion.model.EventItem r1, java.util.HashMap<java.lang.String, java.util.List<com.beizi.fusion.model.EventItem>> r2, java.lang.String r3) {
            if (r2 == 0) goto L29
            boolean r0 = r2.containsKey(r3)
            if (r0 == 0) goto L1c
            java.lang.Object r0 = r2.get(r3)
            java.util.ArrayList r0 = (java.util.ArrayList) r0
            if (r0 == 0) goto L29
            r0.add(r1)
            java.util.Comparator<com.beizi.fusion.model.EventItem> r1 = com.beizi.fusion.tool.s.c
            java.util.Collections.sort(r0, r1)
            r2.put(r3, r0)
            return
        L1c:
            if (r3 == 0) goto L29
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            r0.add(r1)
            r2.put(r3, r0)
        L29:
            return
    }

    public static void a(java.lang.String r4, com.beizi.fusion.model.EventItem r5) {
            java.util.HashMap<java.lang.String, java.lang.Object> r0 = com.beizi.fusion.tool.s.a     // Catch: java.lang.Exception -> L6b
            java.lang.Object r0 = r0.get(r4)     // Catch: java.lang.Exception -> L6b
            java.util.HashMap r0 = (java.util.HashMap) r0     // Catch: java.lang.Exception -> L6b
            if (r0 != 0) goto Lf
            java.util.HashMap r0 = new java.util.HashMap     // Catch: java.lang.Exception -> L6b
            r0.<init>()     // Catch: java.lang.Exception -> L6b
        Lf:
            java.lang.String r1 = r5.getCode()     // Catch: java.lang.Exception -> L6b
            a(r5, r0, r1)     // Catch: java.lang.Exception -> L6b
            java.lang.String r0 = r5.getSpaceId()     // Catch: java.lang.Exception -> L6b
            if (r0 == 0) goto L3e
            java.util.HashMap<java.lang.String, java.lang.Object> r2 = com.beizi.fusion.tool.s.b     // Catch: java.lang.Exception -> L6b
            java.lang.Object r2 = r2.get(r4)     // Catch: java.lang.Exception -> L6b
            java.util.HashMap r2 = (java.util.HashMap) r2     // Catch: java.lang.Exception -> L6b
            if (r2 != 0) goto L2b
            java.util.HashMap r2 = new java.util.HashMap     // Catch: java.lang.Exception -> L6b
            r2.<init>()     // Catch: java.lang.Exception -> L6b
        L2b:
            java.lang.Object r3 = r2.get(r0)     // Catch: java.lang.Exception -> L6b
            java.util.HashMap r3 = (java.util.HashMap) r3     // Catch: java.lang.Exception -> L6b
            if (r3 != 0) goto L38
            java.util.HashMap r3 = new java.util.HashMap     // Catch: java.lang.Exception -> L6b
            r3.<init>()     // Catch: java.lang.Exception -> L6b
        L38:
            a(r5, r3, r1)     // Catch: java.lang.Exception -> L6b
            r2.put(r0, r3)     // Catch: java.lang.Exception -> L6b
        L3e:
            java.lang.String r0 = r5.getChannel()     // Catch: java.lang.Exception -> L6b
            java.util.HashSet<java.lang.String> r2 = com.beizi.fusion.tool.s.f     // Catch: java.lang.Exception -> L6b
            r2.add(r0)     // Catch: java.lang.Exception -> L6b
            if (r0 == 0) goto L6b
            java.util.HashMap<java.lang.String, java.lang.Object> r2 = com.beizi.fusion.tool.s.b     // Catch: java.lang.Exception -> L6b
            java.lang.Object r4 = r2.get(r4)     // Catch: java.lang.Exception -> L6b
            java.util.HashMap r4 = (java.util.HashMap) r4     // Catch: java.lang.Exception -> L6b
            if (r4 != 0) goto L58
            java.util.HashMap r4 = new java.util.HashMap     // Catch: java.lang.Exception -> L6b
            r4.<init>()     // Catch: java.lang.Exception -> L6b
        L58:
            java.lang.Object r2 = r4.get(r0)     // Catch: java.lang.Exception -> L6b
            java.util.HashMap r2 = (java.util.HashMap) r2     // Catch: java.lang.Exception -> L6b
            if (r2 != 0) goto L65
            java.util.HashMap r2 = new java.util.HashMap     // Catch: java.lang.Exception -> L6b
            r2.<init>()     // Catch: java.lang.Exception -> L6b
        L65:
            a(r5, r2, r1)     // Catch: java.lang.Exception -> L6b
            r4.put(r0, r2)     // Catch: java.lang.Exception -> L6b
        L6b:
            return
    }

    private static void a(java.lang.String r4, java.util.List<com.beizi.fusion.model.FreqItem> r5) {
            if (r5 == 0) goto L43
            int r0 = r5.size()
            if (r0 != 0) goto L9
            goto L43
        L9:
            long r0 = b(r4)
            java.util.Iterator r5 = r5.iterator()
        L11:
            boolean r2 = r5.hasNext()
            if (r2 == 0) goto L26
            java.lang.Object r2 = r5.next()
            com.beizi.fusion.model.FreqItem r2 = (com.beizi.fusion.model.FreqItem) r2
            long r2 = r2.getInterval()
            long r0 = java.lang.Math.max(r2, r0)
            goto L11
        L26:
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            r5.<init>()
            java.lang.String r2 = "maxInterval = "
            r5.append(r2)
            r5.append(r0)
            java.lang.String r5 = r5.toString()
            d(r5)
            java.util.HashMap<java.lang.String, java.lang.Long> r5 = com.beizi.fusion.tool.s.d
            java.lang.Long r0 = java.lang.Long.valueOf(r0)
            r5.put(r4, r0)
        L43:
            return
    }

    public static boolean a(java.lang.String r1) {
            java.util.HashMap<java.lang.String, java.lang.Object> r0 = com.beizi.fusion.tool.s.a
            boolean r0 = r0.containsKey(r1)
            if (r0 == 0) goto L12
            java.util.HashMap<java.lang.String, java.lang.Object> r0 = com.beizi.fusion.tool.s.b
            boolean r1 = r0.containsKey(r1)
            if (r1 == 0) goto L12
            r1 = 1
            return r1
        L12:
            r1 = 0
            return r1
    }

    public static boolean a(java.util.List<com.beizi.fusion.model.FreqItem> r18, java.lang.String r19, java.lang.String r20, java.lang.String r21) {
            r0 = r18
            r1 = r19
            r2 = r20
            r3 = 1
            if (r0 == 0) goto L1fe
            int r4 = r0.size()
            if (r4 != 0) goto L11
            goto L1fe
        L11:
            a(r1, r0)
            java.lang.String r4 = ",timeInterval = "
            r5 = 0
            if (r2 != 0) goto Lb7
            java.util.HashMap<java.lang.String, java.lang.Object> r6 = com.beizi.fusion.tool.s.a
            java.lang.Object r6 = r6.get(r1)
            java.util.HashMap r6 = (java.util.HashMap) r6
            java.lang.StringBuilder r7 = new java.lang.StringBuilder
            r7.<init>()
            java.lang.String r8 = "eventMap = "
            r7.append(r8)
            r7.append(r6)
            java.lang.String r7 = r7.toString()
            d(r7)
            if (r6 == 0) goto Lb6
            int r7 = r6.size()
            if (r7 != 0) goto L3f
            goto Lb6
        L3f:
            java.util.Iterator r0 = r0.iterator()
            r7 = 0
        L44:
            boolean r8 = r0.hasNext()
            if (r8 == 0) goto Lb3
            java.lang.Object r7 = r0.next()
            com.beizi.fusion.model.FreqItem r7 = (com.beizi.fusion.model.FreqItem) r7
            java.lang.String r8 = r7.getEventCode()
            long r9 = r7.getInterval()
            int r11 = r7.getCount()
            java.lang.Object r8 = r6.get(r8)
            java.util.ArrayList r8 = (java.util.ArrayList) r8
            if (r11 != 0) goto L65
            return r5
        L65:
            if (r8 == 0) goto Lac
            int r12 = r8.size()
            if (r11 <= r12) goto L6e
            goto Lb1
        L6e:
            long r12 = java.lang.System.currentTimeMillis()
            int r14 = r8.size()
            int r14 = r14 - r11
            java.lang.Object r8 = r8.get(r14)
            com.beizi.fusion.model.EventItem r8 = (com.beizi.fusion.model.EventItem) r8
            java.lang.String r8 = r8.getTimeStamp()
            long r14 = java.lang.Long.parseLong(r8)
            long r12 = r12 - r14
            java.lang.StringBuilder r8 = new java.lang.StringBuilder
            r8.<init>()
            java.lang.String r11 = "platform filter interval = "
            r8.append(r11)
            r8.append(r9)
            r8.append(r4)
            r8.append(r12)
            java.lang.String r8 = r8.toString()
            d(r8)
            int r8 = (r12 > r9 ? 1 : (r12 == r9 ? 0 : -1))
            if (r8 <= 0) goto La5
            goto Lb1
        La5:
            java.util.HashMap<java.lang.String, com.beizi.fusion.model.FreqItem> r0 = com.beizi.fusion.tool.s.e
            r0.put(r1, r7)
            goto L1d9
        Lac:
            java.lang.String r7 = "platform filter localEventItems = null"
            d(r7)
        Lb1:
            r7 = 1
            goto L44
        Lb3:
            r5 = r7
            goto L1d9
        Lb6:
            return r3
        Lb7:
            java.util.HashMap<java.lang.String, java.lang.Object> r6 = com.beizi.fusion.tool.s.b
            java.lang.Object r6 = r6.get(r1)
            java.util.HashMap r6 = (java.util.HashMap) r6
            java.lang.StringBuilder r7 = new java.lang.StringBuilder
            r7.<init>()
            java.lang.String r8 = "spaceChannelMap = "
            r7.append(r8)
            r7.append(r6)
            java.lang.String r7 = r7.toString()
            d(r7)
            if (r6 == 0) goto L1fe
            int r7 = r6.size()
            if (r7 != 0) goto Ldd
            goto L1fe
        Ldd:
            java.lang.Object r7 = r6.get(r2)
            java.util.HashMap r7 = (java.util.HashMap) r7
            java.lang.StringBuilder r8 = new java.lang.StringBuilder
            r8.<init>()
            java.lang.String r9 = "channel filter eventMap = "
            r8.append(r9)
            r8.append(r7)
            java.lang.String r8 = r8.toString()
            d(r8)
            if (r7 == 0) goto L1fe
            int r8 = r7.size()
            if (r8 != 0) goto L101
            goto L1fe
        L101:
            java.util.Iterator r0 = r0.iterator()
            r8 = 0
        L106:
            boolean r9 = r0.hasNext()
            if (r9 == 0) goto L1d8
            java.lang.Object r8 = r0.next()
            com.beizi.fusion.model.FreqItem r8 = (com.beizi.fusion.model.FreqItem) r8
            java.lang.String r9 = r8.getEventCode()
            long r10 = r8.getInterval()
            int r12 = r8.getCount()
            int r13 = r8.getComponentType()
            if (r13 != r3) goto L149
            r13 = r21
            java.lang.Object r7 = r6.get(r13)
            java.util.HashMap r7 = (java.util.HashMap) r7
            java.lang.StringBuilder r14 = new java.lang.StringBuilder
            r14.<init>()
            java.lang.String r15 = "channel filter by space eventMap = "
            r14.append(r15)
            r14.append(r7)
            java.lang.String r14 = r14.toString()
            d(r14)
            if (r7 == 0) goto L148
            int r14 = r7.size()
            if (r14 != 0) goto L14b
        L148:
            return r3
        L149:
            r13 = r21
        L14b:
            java.lang.StringBuilder r14 = new java.lang.StringBuilder
            r14.<init>()
            java.lang.String r15 = "channel filter code = "
            r14.append(r15)
            r14.append(r9)
            java.lang.String r14 = r14.toString()
            d(r14)
            java.lang.Object r9 = r7.get(r9)
            java.util.ArrayList r9 = (java.util.ArrayList) r9
            if (r12 != 0) goto L168
            return r5
        L168:
            if (r9 == 0) goto L1d0
            java.lang.StringBuilder r14 = new java.lang.StringBuilder
            r14.<init>()
            java.lang.String r15 = "channel filter localEventItems != null count = "
            r14.append(r15)
            r14.append(r12)
            java.lang.String r15 = ",localEventItems.size() = "
            r14.append(r15)
            int r15 = r9.size()
            r14.append(r15)
            java.lang.String r14 = r14.toString()
            d(r14)
            int r14 = r9.size()
            if (r12 <= r14) goto L191
            goto L1d5
        L191:
            long r14 = java.lang.System.currentTimeMillis()
            int r16 = r9.size()
            int r12 = r16 - r12
            java.lang.Object r9 = r9.get(r12)
            com.beizi.fusion.model.EventItem r9 = (com.beizi.fusion.model.EventItem) r9
            java.lang.String r9 = r9.getTimeStamp()
            long r16 = java.lang.Long.parseLong(r9)
            long r14 = r14 - r16
            java.lang.StringBuilder r9 = new java.lang.StringBuilder
            r9.<init>()
            java.lang.String r12 = "channel filter interval = "
            r9.append(r12)
            r9.append(r10)
            r9.append(r4)
            r9.append(r14)
            java.lang.String r9 = r9.toString()
            d(r9)
            int r9 = (r14 > r10 ? 1 : (r14 == r10 ? 0 : -1))
            if (r9 <= 0) goto L1ca
            goto L1d5
        L1ca:
            java.util.HashMap<java.lang.String, com.beizi.fusion.model.FreqItem> r0 = com.beizi.fusion.tool.s.e
            r0.put(r1, r8)
            goto L1d9
        L1d0:
            java.lang.String r8 = "channel filter localEventItems = null"
            d(r8)
        L1d5:
            r8 = 1
            goto L106
        L1d8:
            r5 = r8
        L1d9:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r3 = "filter adUnitId = "
            r0.append(r3)
            r0.append(r1)
            java.lang.String r1 = ",channel = "
            r0.append(r1)
            r0.append(r2)
            java.lang.String r1 = ",goThrough = "
            r0.append(r1)
            r0.append(r5)
            java.lang.String r0 = r0.toString()
            d(r0)
            return r5
        L1fe:
            return r3
    }

    public static long b(java.lang.String r2) {
            java.util.HashMap<java.lang.String, java.lang.Long> r0 = com.beizi.fusion.tool.s.d
            java.lang.Object r2 = r0.get(r2)
            java.lang.Long r2 = (java.lang.Long) r2
            if (r2 != 0) goto Ld
            r0 = 0
            return r0
        Ld:
            long r0 = r2.longValue()
            return r0
    }

    private static java.util.Map<java.lang.String, java.util.Map<java.lang.String, java.util.List<com.beizi.fusion.model.EventItem>>> b(java.util.List<com.beizi.fusion.model.EventItem> r5) {
            if (r5 == 0) goto Lc2
            int r0 = r5.size()
            if (r0 != 0) goto La
            goto Lc2
        La:
            java.util.HashMap r0 = new java.util.HashMap
            r0.<init>()
            java.util.HashMap r1 = new java.util.HashMap
            r1.<init>()
            java.util.Iterator r5 = r5.iterator()
        L18:
            boolean r2 = r5.hasNext()
            if (r2 == 0) goto L70
            java.lang.Object r2 = r5.next()
            com.beizi.fusion.model.EventItem r2 = (com.beizi.fusion.model.EventItem) r2
            java.lang.String r3 = r2.getSpaceId()
            if (r3 == 0) goto L47
            boolean r4 = r0.containsKey(r3)
            if (r4 != 0) goto L39
            java.util.ArrayList r4 = new java.util.ArrayList
            r4.<init>()
            r4.add(r2)
            goto L44
        L39:
            java.lang.Object r4 = r0.get(r3)
            java.util.ArrayList r4 = (java.util.ArrayList) r4
            if (r4 == 0) goto L44
            r4.add(r2)
        L44:
            r0.put(r3, r4)
        L47:
            java.lang.String r3 = r2.getChannel()
            java.util.HashSet<java.lang.String> r4 = com.beizi.fusion.tool.s.f
            r4.add(r3)
            if (r3 == 0) goto L18
            boolean r4 = r1.containsKey(r3)
            if (r4 != 0) goto L61
            java.util.ArrayList r4 = new java.util.ArrayList
            r4.<init>()
            r4.add(r2)
            goto L6c
        L61:
            java.lang.Object r4 = r1.get(r3)
            java.util.ArrayList r4 = (java.util.ArrayList) r4
            if (r4 == 0) goto L6c
            r4.add(r2)
        L6c:
            r1.put(r3, r4)
            goto L18
        L70:
            java.util.HashMap r5 = new java.util.HashMap
            r5.<init>()
            java.util.Set r2 = r0.keySet()
            java.util.Iterator r2 = r2.iterator()
        L7d:
            boolean r3 = r2.hasNext()
            if (r3 == 0) goto L9b
            java.lang.Object r3 = r2.next()
            java.lang.String r3 = (java.lang.String) r3
            java.lang.Object r4 = r0.get(r3)
            java.util.ArrayList r4 = (java.util.ArrayList) r4
            if (r4 == 0) goto L7d
            java.util.Map r4 = a(r4)
            java.util.HashMap r4 = (java.util.HashMap) r4
            r5.put(r3, r4)
            goto L7d
        L9b:
            java.util.Set r0 = r1.keySet()
            java.util.Iterator r0 = r0.iterator()
        La3:
            boolean r2 = r0.hasNext()
            if (r2 == 0) goto Lc1
            java.lang.Object r2 = r0.next()
            java.lang.String r2 = (java.lang.String) r2
            java.lang.Object r3 = r1.get(r2)
            java.util.ArrayList r3 = (java.util.ArrayList) r3
            if (r3 == 0) goto La3
            java.util.Map r3 = a(r3)
            java.util.HashMap r3 = (java.util.HashMap) r3
            r5.put(r2, r3)
            goto La3
        Lc1:
            return r5
        Lc2:
            java.util.HashMap r5 = new java.util.HashMap
            r5.<init>()
            return r5
    }

    public static void b(android.content.Context r2, java.lang.String r3) {
            boolean r0 = a(r3)
            if (r0 != 0) goto L32
            c(r2, r3)
            r2 = 0
        La:
            boolean r0 = a(r3)
            if (r0 != 0) goto L32
            r0 = 100
            if (r2 >= r0) goto L32
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "currentWaitInitTime = "
            r0.append(r1)
            r0.append(r2)
            java.lang.String r0 = r0.toString()
            d(r0)
            r0 = 5
            java.lang.Thread.sleep(r0)     // Catch: java.lang.InterruptedException -> L30
            int r2 = r2 + 5
            goto La
        L30:
            goto La
        L32:
            return
    }

    public static com.beizi.fusion.model.FreqItem c(java.lang.String r1) {
            java.util.HashMap<java.lang.String, com.beizi.fusion.model.FreqItem> r0 = com.beizi.fusion.tool.s.e
            java.lang.Object r1 = r0.get(r1)
            com.beizi.fusion.model.FreqItem r1 = (com.beizi.fusion.model.FreqItem) r1
            return r1
    }

    private static void c(android.content.Context r2, java.lang.String r3) {
            com.beizi.fusion.tool.e r0 = com.beizi.fusion.tool.e.b()
            java.util.concurrent.ExecutorService r0 = r0.c()
            com.beizi.fusion.tool.s$2 r1 = new com.beizi.fusion.tool.s$2
            r1.<init>(r2, r3)
            r0.execute(r1)
            return
    }

    public static void d(java.lang.String r1) {
            java.lang.String r0 = "FreqUtil"
            com.beizi.fusion.tool.aa.b(r0, r1)
            return
    }
}
