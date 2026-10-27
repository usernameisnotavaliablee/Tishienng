package com.google.android.gms.internal.mlkit_vision_pose_common;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_9_sz8866584.dex */
final class zzwz {
    private static final java.util.regex.Pattern zza = null;
    private final android.content.Context zzb;
    private final java.lang.String zzc;
    private final java.lang.String zzd;
    private final java.lang.String zze;
    private final com.google.android.gms.internal.mlkit_vision_pose_common.zzxi zzf;

    static {
            java.lang.String r0 = "^[^:]+:([0-9]+):(android|ios|web):([0-9a-f]+)"
            java.util.regex.Pattern r0 = java.util.regex.Pattern.compile(r0)
            com.google.android.gms.internal.mlkit_vision_pose_common.zzwz.zza = r0
            return
    }

    public zzwz(android.content.Context r1, java.lang.String r2, java.lang.String r3, java.lang.String r4, long r5, long r7, com.google.android.gms.internal.mlkit_vision_pose_common.zzxi r9) {
            r0 = this;
            r0.<init>()
            r0.zzb = r1
            r0.zzc = r2
            r0.zzd = r3
            java.util.regex.Pattern r1 = com.google.android.gms.internal.mlkit_vision_pose_common.zzwz.zza
            java.util.regex.Matcher r1 = r1.matcher(r2)
            boolean r2 = r1.matches()
            if (r2 == 0) goto L1b
            r2 = 1
            java.lang.String r1 = r1.group(r2)
            goto L1c
        L1b:
            r1 = 0
        L1c:
            r0.zze = r1
            r0.zzf = r9
            return
    }

    final com.google.android.gms.internal.mlkit_vision_pose_common.zzxa zza(java.net.HttpURLConnection r12, java.lang.String r13, java.lang.String r14, java.util.Map r15, java.lang.String r16, java.util.Map r17, java.util.Date r18, java.lang.String r19, @androidx.annotation.Nullable java.lang.String r20, com.google.android.gms.internal.mlkit_vision_pose_common.zzvr r21) throws com.google.android.gms.internal.mlkit_vision_pose_common.zzxh {
            r11 = this;
            r1 = r21
            r0 = 1
            r12.setDoOutput(r0)
            java.util.concurrent.TimeUnit r2 = java.util.concurrent.TimeUnit.SECONDS
            r3 = 5
            long r5 = r2.toMillis(r3)
            int r6 = (int) r5
            r12.setConnectTimeout(r6)
            long r2 = r2.toMillis(r3)
            int r3 = (int) r2
            r12.setReadTimeout(r3)
            java.lang.String r2 = "If-None-Match"
            r3 = 0
            r12.setRequestProperty(r2, r3)
            java.lang.String r2 = "X-Goog-Api-Key"
            java.lang.String r4 = r11.zzd
            r12.setRequestProperty(r2, r4)
            android.content.Context r2 = r11.zzb
            java.lang.String r4 = "X-Android-Package"
            java.lang.String r2 = r2.getPackageName()
            r12.setRequestProperty(r4, r2)
            r2 = 0
            android.content.Context r4 = r11.zzb     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L4b
            java.lang.String r5 = r4.getPackageName()     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L4b
            byte[] r4 = com.google.android.gms.common.util.AndroidUtilsLight.getPackageCertificateHashBytes(r4, r5)     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L4b
            if (r4 != 0) goto L46
            android.content.Context r4 = r11.zzb     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L4b
            r4.getPackageName()     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L4b
        L44:
            r4 = r3
            goto L5b
        L46:
            java.lang.String r4 = com.google.android.gms.common.util.Hex.bytesToStringUppercase(r4, r2)     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L4b
            goto L5b
        L4b:
            android.content.Context r4 = r11.zzb
            java.lang.String r4 = r4.getPackageName()
            java.lang.String r4 = java.lang.String.valueOf(r4)
            java.lang.String r5 = "No such package: "
            r5.concat(r4)
            goto L44
        L5b:
            java.lang.String r5 = "X-Android-Cert"
            r12.setRequestProperty(r5, r4)
            java.lang.String r4 = "X-Google-GFE-Can-Retry"
            java.lang.String r5 = "yes"
            r12.setRequestProperty(r4, r5)
            java.lang.String r4 = "Content-Type"
            java.lang.String r5 = "application/json"
            r12.setRequestProperty(r4, r5)
            java.lang.String r4 = "Accept"
            r12.setRequestProperty(r4, r5)
            r4 = r17
            com.google.android.gms.internal.mlkit_vision_pose_common.zzbg r4 = (com.google.android.gms.internal.mlkit_vision_pose_common.zzbg) r4
            com.google.android.gms.internal.mlkit_vision_pose_common.zzbh r4 = r4.zzg()
            java.util.Iterator r4 = r4.iterator()
        L7f:
            boolean r5 = r4.hasNext()
            if (r5 == 0) goto L9b
            java.lang.Object r5 = r4.next()
            java.util.Map$Entry r5 = (java.util.Map.Entry) r5
            java.lang.Object r6 = r5.getKey()
            java.lang.String r6 = (java.lang.String) r6
            java.lang.Object r5 = r5.getValue()
            java.lang.String r5 = (java.lang.String) r5
            r12.setRequestProperty(r6, r5)
            goto L7f
        L9b:
            java.lang.String r4 = "MLKitRemoteConfigFetch"
            r5 = 3
            boolean r6 = android.util.Log.isLoggable(r4, r5)
            if (r6 != 0) goto La5
            goto Lf2
        La5:
            java.util.Map r6 = r12.getRequestProperties()
            java.util.Set r6 = r6.entrySet()
            java.util.Iterator r6 = r6.iterator()
        Lb1:
            boolean r7 = r6.hasNext()
            if (r7 == 0) goto Lf2
            java.lang.Object r7 = r6.next()
            java.util.Map$Entry r7 = (java.util.Map.Entry) r7
            java.lang.Object r8 = r7.getKey()
            java.lang.String r8 = (java.lang.String) r8
            java.lang.String r9 = com.google.android.gms.internal.mlkit_vision_pose_common.zzh.zza(r8)
            java.lang.String r10 = "api-key"
            boolean r9 = r9.contains(r10)
            if (r9 != 0) goto Lb1
            java.lang.String r8 = com.google.android.gms.internal.mlkit_vision_pose_common.zzh.zza(r8)
            java.lang.String r9 = "android-cert"
            boolean r8 = r8.contains(r9)
            if (r8 != 0) goto Lb1
            java.lang.Object r7 = r7.getValue()
            java.util.List r7 = (java.util.List) r7
            java.util.Iterator r7 = r7.iterator()
        Le5:
            boolean r8 = r7.hasNext()
            if (r8 == 0) goto Lb1
            java.lang.Object r8 = r7.next()
            java.lang.String r8 = (java.lang.String) r8
            goto Le5
        Lf2:
            java.util.HashMap r6 = new java.util.HashMap
            r6.<init>()
            if (r13 == 0) goto L3b1
            java.lang.String r7 = "appInstanceId"
            r6.put(r7, r13)
            java.lang.String r13 = "appInstanceIdToken"
            r6.put(r13, r14)
            java.lang.String r7 = r11.zzc
            java.lang.String r8 = "appId"
            r6.put(r8, r7)
            android.content.Context r7 = r11.zzb
            android.content.res.Resources r7 = r7.getResources()
            android.content.res.Configuration r7 = r7.getConfiguration()
            java.util.Locale r7 = r7.locale
            java.lang.String r8 = r7.getCountry()
            java.lang.String r9 = "countryCode"
            r6.put(r9, r8)
            java.lang.String r7 = r7.toString()
            java.lang.String r8 = "languageCode"
            r6.put(r8, r7)
            int r7 = android.os.Build.VERSION.SDK_INT
            java.lang.String r7 = java.lang.Integer.toString(r7)
            java.lang.String r8 = "platformVersion"
            r6.put(r8, r7)
            java.util.TimeZone r7 = java.util.TimeZone.getDefault()
            java.lang.String r7 = r7.getID()
            java.lang.String r8 = "timeZone"
            r6.put(r8, r7)
            android.content.Context r7 = r11.zzb     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L155
            android.content.pm.PackageManager r7 = r7.getPackageManager()     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L155
            android.content.Context r8 = r11.zzb     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L155
            java.lang.String r8 = r8.getPackageName()     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L155
            android.content.pm.PackageInfo r7 = r7.getPackageInfo(r8, r2)     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L155
            if (r7 == 0) goto L156
            java.lang.String r7 = r7.versionName     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L155
            goto L157
        L155:
        L156:
            r7 = r3
        L157:
            r8 = 2
            java.lang.Object[] r8 = new java.lang.Object[r8]
            r8[r2] = r7
            r8[r0] = r20
            java.lang.String r0 = "%s-MLKit-%s"
            java.lang.String r0 = java.lang.String.format(r0, r8)
            java.lang.String r2 = "APP_VERSION: "
            r2.concat(r0)
            java.lang.String r2 = "appVersion"
            r6.put(r2, r0)
            android.content.Context r0 = r11.zzb
            java.lang.String r2 = "packageName"
            java.lang.String r0 = r0.getPackageName()
            r6.put(r2, r0)
            java.lang.String r0 = "sdkVersion"
            java.lang.String r2 = "o:a:mlkit:1.0.0"
            r6.put(r0, r2)
            org.json.JSONObject r0 = new org.json.JSONObject
            r0.<init>(r15)
            java.lang.String r2 = "analyticsUserProperties"
            r6.put(r2, r0)
            org.json.JSONObject r0 = new org.json.JSONObject
            r0.<init>(r6)
            boolean r2 = android.util.Log.isLoggable(r4, r5)
            if (r2 != 0) goto L196
            goto L1c9
        L196:
            org.json.JSONObject r2 = new org.json.JSONObject
            r2.<init>()
            java.util.Iterator r6 = r0.keys()
        L19f:
            boolean r7 = r6.hasNext()
            if (r7 == 0) goto L1bd
            java.lang.Object r7 = r6.next()
            java.lang.String r7 = (java.lang.String) r7
            java.lang.Object r8 = r0.get(r7)     // Catch: org.json.JSONException -> L1b3
            r2.put(r7, r8)     // Catch: org.json.JSONException -> L1b3
            goto L19f
        L1b3:
            r0 = move-exception
            r12 = r0
            java.lang.IllegalStateException r13 = new java.lang.IllegalStateException
            java.lang.String r0 = "shallowCopyJsonObject: concurrent mutation?"
            r13.<init>(r0, r12)
            throw r13
        L1bd:
            r2.remove(r13)
            java.lang.String r13 = r2.toString()
            java.lang.String r2 = "HTTP Request Body: "
            r2.concat(r13)
        L1c9:
            java.lang.String r13 = r0.toString()
            java.nio.charset.Charset r0 = java.nio.charset.StandardCharsets.UTF_8
            byte[] r13 = r13.getBytes(r0)
            com.google.android.gms.internal.mlkit_vision_pose_common.zzvr r2 = new com.google.android.gms.internal.mlkit_vision_pose_common.zzvr
            r2.<init>()
            r2.zzg()
            java.lang.String r0 = java.lang.String.valueOf(r12)     // Catch: java.lang.Throwable -> L29a
            java.lang.String r6 = "Connecting: "
            r6.concat(r0)     // Catch: java.lang.Throwable -> L29a
            int r0 = r13.length     // Catch: java.lang.Throwable -> L29a java.io.IOException -> L38e
            r12.setFixedLengthStreamingMode(r0)     // Catch: java.lang.Throwable -> L29a java.io.IOException -> L38e
            java.io.BufferedOutputStream r0 = new java.io.BufferedOutputStream     // Catch: java.lang.Throwable -> L29a java.io.IOException -> L38e
            java.io.OutputStream r6 = r12.getOutputStream()     // Catch: java.lang.Throwable -> L29a java.io.IOException -> L38e
            r0.<init>(r6)     // Catch: java.lang.Throwable -> L29a java.io.IOException -> L38e
            r0.write(r13)     // Catch: java.lang.Throwable -> L29a java.io.IOException -> L38e
            r0.flush()     // Catch: java.lang.Throwable -> L29a java.io.IOException -> L38e
            r0.close()     // Catch: java.lang.Throwable -> L29a java.io.IOException -> L38e
            r12.connect()     // Catch: java.lang.Throwable -> L29a java.io.IOException -> L38e
            int r13 = r12.getResponseCode()     // Catch: java.lang.Throwable -> L29a java.io.IOException -> L38e
            r2.zzf(r13)     // Catch: java.lang.Throwable -> L244
            r0 = 200(0xc8, float:2.8E-43)
            if (r13 != r0) goto L308
            boolean r13 = android.util.Log.isLoggable(r4, r5)     // Catch: java.lang.Throwable -> L244
            if (r13 != 0) goto L20f
            goto L248
        L20f:
            java.util.Map r13 = r12.getHeaderFields()     // Catch: java.lang.Throwable -> L244
            java.util.Set r13 = r13.entrySet()     // Catch: java.lang.Throwable -> L244
            java.util.Iterator r13 = r13.iterator()     // Catch: java.lang.Throwable -> L244
        L21b:
            boolean r0 = r13.hasNext()     // Catch: java.lang.Throwable -> L244
            if (r0 == 0) goto L248
            java.lang.Object r0 = r13.next()     // Catch: java.lang.Throwable -> L244
            java.util.Map$Entry r0 = (java.util.Map.Entry) r0     // Catch: java.lang.Throwable -> L244
            java.lang.Object r4 = r0.getValue()     // Catch: java.lang.Throwable -> L244
            java.util.List r4 = (java.util.List) r4     // Catch: java.lang.Throwable -> L244
            java.util.Iterator r4 = r4.iterator()     // Catch: java.lang.Throwable -> L244
        L231:
            boolean r5 = r4.hasNext()     // Catch: java.lang.Throwable -> L244
            if (r5 == 0) goto L21b
            java.lang.Object r5 = r4.next()     // Catch: java.lang.Throwable -> L244
            java.lang.String r5 = (java.lang.String) r5     // Catch: java.lang.Throwable -> L244
            java.lang.Object r5 = r0.getKey()     // Catch: java.lang.Throwable -> L244
            java.lang.String r5 = (java.lang.String) r5     // Catch: java.lang.Throwable -> L244
            goto L231
        L244:
            r0 = move-exception
            r13 = r0
            goto L38a
        L248:
            java.lang.String r13 = "ETag"
            java.lang.String r13 = r12.getHeaderField(r13)     // Catch: java.lang.Throwable -> L244
            java.io.BufferedReader r0 = new java.io.BufferedReader     // Catch: java.lang.Throwable -> L244 java.io.IOException -> L26f org.json.JSONException -> L273
            java.io.InputStreamReader r4 = new java.io.InputStreamReader     // Catch: java.lang.Throwable -> L244 java.io.IOException -> L26f org.json.JSONException -> L273
            java.io.InputStream r5 = r12.getInputStream()     // Catch: java.lang.Throwable -> L244 java.io.IOException -> L26f org.json.JSONException -> L273
            java.nio.charset.Charset r6 = java.nio.charset.StandardCharsets.UTF_8     // Catch: java.lang.Throwable -> L244 java.io.IOException -> L26f org.json.JSONException -> L273
            r4.<init>(r5, r6)     // Catch: java.lang.Throwable -> L244 java.io.IOException -> L26f org.json.JSONException -> L273
            r0.<init>(r4)     // Catch: java.lang.Throwable -> L244 java.io.IOException -> L26f org.json.JSONException -> L273
            java.lang.StringBuilder r4 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L244 java.io.IOException -> L26f org.json.JSONException -> L273
            r4.<init>()     // Catch: java.lang.Throwable -> L244 java.io.IOException -> L26f org.json.JSONException -> L273
        L263:
            int r5 = r0.read()     // Catch: java.lang.Throwable -> L244 java.io.IOException -> L26f org.json.JSONException -> L273
            r6 = -1
            if (r5 == r6) goto L277
            char r5 = (char) r5     // Catch: java.lang.Throwable -> L244 java.io.IOException -> L26f org.json.JSONException -> L273
            r4.append(r5)     // Catch: java.lang.Throwable -> L244 java.io.IOException -> L26f org.json.JSONException -> L273
            goto L263
        L26f:
            r0 = move-exception
            r13 = r0
            goto L2e8
        L273:
            r0 = move-exception
            r13 = r0
            goto L2f8
        L277:
            org.json.JSONObject r0 = new org.json.JSONObject     // Catch: java.lang.Throwable -> L244 java.io.IOException -> L26f org.json.JSONException -> L273
            java.lang.String r4 = r4.toString()     // Catch: java.lang.Throwable -> L244 java.io.IOException -> L26f org.json.JSONException -> L273
            r0.<init>(r4)     // Catch: java.lang.Throwable -> L244 java.io.IOException -> L26f org.json.JSONException -> L273
            r0.toString()     // Catch: java.lang.Throwable -> L244
            r12.disconnect()     // Catch: java.lang.Throwable -> L29a
            java.lang.String r12 = "state"
            java.lang.Object r12 = r0.get(r12)     // Catch: java.lang.Throwable -> L29a org.json.JSONException -> L29e
            java.lang.String r4 = "NO_CHANGE"
            boolean r12 = r12.equals(r4)     // Catch: java.lang.Throwable -> L29a org.json.JSONException -> L29e
            if (r12 != 0) goto L295
            goto L29e
        L295:
            com.google.android.gms.internal.mlkit_vision_pose_common.zzxa r12 = com.google.android.gms.internal.mlkit_vision_pose_common.zzxa.zzb(r18)     // Catch: java.lang.Throwable -> L29a
            goto L2cf
        L29a:
            r0 = move-exception
            r12 = r0
            goto L3a8
        L29e:
            com.google.android.gms.internal.mlkit_vision_pose_common.zzwx r12 = new com.google.android.gms.internal.mlkit_vision_pose_common.zzwx     // Catch: java.lang.Throwable -> L29a org.json.JSONException -> L2b7
            r12.<init>(r3)     // Catch: java.lang.Throwable -> L29a org.json.JSONException -> L2b7
            r4 = r18
            r12.zzc(r4)     // Catch: java.lang.Throwable -> L29a org.json.JSONException -> L2b7
            java.lang.String r4 = "entries"
            org.json.JSONObject r4 = r0.getJSONObject(r4)     // Catch: java.lang.Throwable -> L29a org.json.JSONException -> L2af
            goto L2b1
        L2af:
            r4 = r3
        L2b1:
            if (r4 == 0) goto L2ba
            r12.zza(r4)     // Catch: java.lang.Throwable -> L29a org.json.JSONException -> L2b7
            goto L2ba
        L2b7:
            r0 = move-exception
            r12 = r0
            goto L2d8
        L2ba:
            java.lang.String r4 = "experimentDescriptions"
            org.json.JSONArray r3 = r0.getJSONArray(r4)     // Catch: java.lang.Throwable -> L29a org.json.JSONException -> L2c1
            goto L2c2
        L2c1:
        L2c2:
            if (r3 == 0) goto L2c7
            r12.zzb(r3)     // Catch: java.lang.Throwable -> L29a org.json.JSONException -> L2b7
        L2c7:
            com.google.android.gms.internal.mlkit_vision_pose_common.zzwy r12 = r12.zzd()     // Catch: java.lang.Throwable -> L29a org.json.JSONException -> L2b7
            com.google.android.gms.internal.mlkit_vision_pose_common.zzxa r12 = com.google.android.gms.internal.mlkit_vision_pose_common.zzxa.zzc(r12, r13)     // Catch: java.lang.Throwable -> L29a
        L2cf:
            r2.zze()
            com.google.android.gms.internal.mlkit_vision_pose_common.zzxi r13 = r11.zzf
            r13.zzd(r2)
            return r12
        L2d8:
            com.google.android.gms.internal.mlkit_vision_pose_common.zztd r13 = com.google.android.gms.internal.mlkit_vision_pose_common.zztd.zzd     // Catch: java.lang.Throwable -> L29a
            r2.zzd(r13)     // Catch: java.lang.Throwable -> L29a
            r1.zzb(r13)     // Catch: java.lang.Throwable -> L29a
            com.google.android.gms.internal.mlkit_vision_pose_common.zzxg r13 = new com.google.android.gms.internal.mlkit_vision_pose_common.zzxg     // Catch: java.lang.Throwable -> L29a
            java.lang.String r0 = "Fetch failed: fetch response could not be parsed."
            r13.<init>(r0, r12)     // Catch: java.lang.Throwable -> L29a
            throw r13     // Catch: java.lang.Throwable -> L29a
        L2e8:
            com.google.android.gms.internal.mlkit_vision_pose_common.zztd r0 = com.google.android.gms.internal.mlkit_vision_pose_common.zztd.zzc     // Catch: java.lang.Throwable -> L244
            r2.zzd(r0)     // Catch: java.lang.Throwable -> L244
            r1.zzb(r0)     // Catch: java.lang.Throwable -> L244
            com.google.android.gms.internal.mlkit_vision_pose_common.zzxg r0 = new com.google.android.gms.internal.mlkit_vision_pose_common.zzxg     // Catch: java.lang.Throwable -> L244
            java.lang.String r1 = "The client had an error while calling the backend!"
            r0.<init>(r1, r13)     // Catch: java.lang.Throwable -> L244
            throw r0     // Catch: java.lang.Throwable -> L244
        L2f8:
            com.google.android.gms.internal.mlkit_vision_pose_common.zztd r0 = com.google.android.gms.internal.mlkit_vision_pose_common.zztd.zze     // Catch: java.lang.Throwable -> L244
            r2.zzd(r0)     // Catch: java.lang.Throwable -> L244
            r1.zzb(r0)     // Catch: java.lang.Throwable -> L244
            com.google.android.gms.internal.mlkit_vision_pose_common.zzxg r0 = new com.google.android.gms.internal.mlkit_vision_pose_common.zzxg     // Catch: java.lang.Throwable -> L244
            java.lang.String r1 = "Error parsing the server output"
            r0.<init>(r1, r13)     // Catch: java.lang.Throwable -> L244
            throw r0     // Catch: java.lang.Throwable -> L244
        L308:
            com.google.android.gms.internal.mlkit_vision_pose_common.zztd r0 = com.google.android.gms.internal.mlkit_vision_pose_common.zztd.zzc     // Catch: java.lang.Throwable -> L244
            r2.zzd(r0)     // Catch: java.lang.Throwable -> L244
            r1.zzb(r0)     // Catch: java.lang.Throwable -> L244
            r0 = 4
            boolean r0 = android.util.Log.isLoggable(r4, r0)     // Catch: java.lang.Throwable -> L244
            if (r0 == 0) goto L34c
            java.util.Map r0 = r12.getHeaderFields()     // Catch: java.lang.Throwable -> L244
            java.util.Set r0 = r0.entrySet()     // Catch: java.lang.Throwable -> L244
            java.util.Iterator r0 = r0.iterator()     // Catch: java.lang.Throwable -> L244
        L323:
            boolean r1 = r0.hasNext()     // Catch: java.lang.Throwable -> L244
            if (r1 == 0) goto L34c
            java.lang.Object r1 = r0.next()     // Catch: java.lang.Throwable -> L244
            java.util.Map$Entry r1 = (java.util.Map.Entry) r1     // Catch: java.lang.Throwable -> L244
            java.lang.Object r3 = r1.getValue()     // Catch: java.lang.Throwable -> L244
            java.util.List r3 = (java.util.List) r3     // Catch: java.lang.Throwable -> L244
            java.util.Iterator r3 = r3.iterator()     // Catch: java.lang.Throwable -> L244
        L339:
            boolean r5 = r3.hasNext()     // Catch: java.lang.Throwable -> L244
            if (r5 == 0) goto L323
            java.lang.Object r5 = r3.next()     // Catch: java.lang.Throwable -> L244
            java.lang.String r5 = (java.lang.String) r5     // Catch: java.lang.Throwable -> L244
            java.lang.Object r5 = r1.getKey()     // Catch: java.lang.Throwable -> L244
            java.lang.String r5 = (java.lang.String) r5     // Catch: java.lang.Throwable -> L244
            goto L339
        L34c:
            r0 = 5
            boolean r0 = android.util.Log.isLoggable(r4, r0)     // Catch: java.lang.Throwable -> L244
            if (r0 == 0) goto L377
            java.io.InputStream r0 = r12.getErrorStream()     // Catch: java.lang.Throwable -> L244
            if (r0 == 0) goto L377
            java.util.Scanner r1 = new java.util.Scanner     // Catch: java.lang.Throwable -> L244
            r1.<init>(r0)     // Catch: java.lang.Throwable -> L244
            java.lang.String r0 = "\\A"
            java.util.Scanner r0 = r1.useDelimiter(r0)     // Catch: java.lang.Throwable -> L244
            boolean r1 = r0.hasNext()     // Catch: java.lang.Throwable -> L244
            if (r1 == 0) goto L377
            java.lang.String r0 = r0.next()     // Catch: java.lang.Throwable -> L244
            java.lang.String r1 = "HTTP Error Stream: "
            java.lang.String r0 = java.lang.String.valueOf(r0)     // Catch: java.lang.Throwable -> L244
            r1.concat(r0)     // Catch: java.lang.Throwable -> L244
        L377:
            com.google.android.gms.internal.mlkit_vision_pose_common.zzxl r0 = new com.google.android.gms.internal.mlkit_vision_pose_common.zzxl     // Catch: java.lang.Throwable -> L244 java.io.IOException -> L381
            java.lang.String r1 = r12.getResponseMessage()     // Catch: java.lang.Throwable -> L244 java.io.IOException -> L381
            r0.<init>(r13, r1)     // Catch: java.lang.Throwable -> L244 java.io.IOException -> L381
            throw r0     // Catch: java.lang.Throwable -> L244 java.io.IOException -> L381
        L381:
            r0 = move-exception
            com.google.android.gms.internal.mlkit_vision_pose_common.zzxl r1 = new com.google.android.gms.internal.mlkit_vision_pose_common.zzxl     // Catch: java.lang.Throwable -> L244
            java.lang.String r3 = "<error reading HTTP response>"
            r1.<init>(r13, r3, r0)     // Catch: java.lang.Throwable -> L244
            throw r1     // Catch: java.lang.Throwable -> L244
        L38a:
            r12.disconnect()     // Catch: java.lang.Throwable -> L29a
            throw r13     // Catch: java.lang.Throwable -> L29a
        L38e:
            r0 = move-exception
            r13 = r0
            com.google.android.gms.internal.mlkit_vision_pose_common.zztd r0 = com.google.android.gms.internal.mlkit_vision_pose_common.zztd.zzb     // Catch: java.lang.Throwable -> L29a
            r2.zzd(r0)     // Catch: java.lang.Throwable -> L29a
            r1.zzb(r0)     // Catch: java.lang.Throwable -> L29a
            com.google.android.gms.internal.mlkit_vision_pose_common.zzxg r0 = new com.google.android.gms.internal.mlkit_vision_pose_common.zzxg     // Catch: java.lang.Throwable -> L29a
            java.lang.String r12 = java.lang.String.valueOf(r12)     // Catch: java.lang.Throwable -> L29a
            java.lang.String r1 = "Error connecting to "
            java.lang.String r12 = r1.concat(r12)     // Catch: java.lang.Throwable -> L29a
            r0.<init>(r12, r13)     // Catch: java.lang.Throwable -> L29a
            throw r0     // Catch: java.lang.Throwable -> L29a
        L3a8:
            r2.zze()
            com.google.android.gms.internal.mlkit_vision_pose_common.zzxi r13 = r11.zzf
            r13.zzd(r2)
            throw r12
        L3b1:
            com.google.android.gms.internal.mlkit_vision_pose_common.zzxg r12 = new com.google.android.gms.internal.mlkit_vision_pose_common.zzxg
            java.lang.String r13 = "Fetch failed: Firebase instance id is null."
            r12.<init>(r13)
            throw r12
    }

    public final java.net.HttpURLConnection zzb() throws com.google.android.gms.internal.mlkit_vision_pose_common.zzxh {
            r5 = this;
            java.lang.String r0 = "https://firebaseremoteconfig.googleapis.com/v1/projects/%s/namespaces/%s:fetch"
            java.net.URL r1 = new java.net.URL     // Catch: java.io.IOException -> L1f
            java.lang.String r2 = r5.zze     // Catch: java.io.IOException -> L1f
            r3 = 2
            java.lang.Object[] r3 = new java.lang.Object[r3]     // Catch: java.io.IOException -> L1f
            r4 = 0
            r3[r4] = r2     // Catch: java.io.IOException -> L1f
            java.lang.String r2 = "firebase"
            r4 = 1
            r3[r4] = r2     // Catch: java.io.IOException -> L1f
            java.lang.String r0 = java.lang.String.format(r0, r3)     // Catch: java.io.IOException -> L1f
            r1.<init>(r0)     // Catch: java.io.IOException -> L1f
            java.net.URLConnection r0 = r1.openConnection()     // Catch: java.io.IOException -> L1f
            java.net.HttpURLConnection r0 = (java.net.HttpURLConnection) r0     // Catch: java.io.IOException -> L1f
            return r0
        L1f:
            r0 = move-exception
            com.google.android.gms.internal.mlkit_vision_pose_common.zzxh r1 = new com.google.android.gms.internal.mlkit_vision_pose_common.zzxh
            java.lang.String r0 = r0.getMessage()
            r1.<init>(r0)
            throw r1
    }
}
