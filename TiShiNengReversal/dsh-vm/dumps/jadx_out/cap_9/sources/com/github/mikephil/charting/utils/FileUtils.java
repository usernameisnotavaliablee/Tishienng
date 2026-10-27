package com.github.mikephil.charting.utils;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_9_sz8866584.dex */
public class FileUtils {
    private static final java.lang.String LOG = "MPChart-FileUtils";

    public FileUtils() {
            r0 = this;
            r0.<init>()
            return
    }

    public static java.util.List<com.github.mikephil.charting.data.BarEntry> loadBarEntriesFromAssets(android.content.res.AssetManager r4, java.lang.String r5) {
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            r1 = 0
            java.io.BufferedReader r2 = new java.io.BufferedReader     // Catch: java.lang.Throwable -> L4c java.io.IOException -> L4e
            java.io.InputStreamReader r3 = new java.io.InputStreamReader     // Catch: java.lang.Throwable -> L4c java.io.IOException -> L4e
            java.io.InputStream r4 = r4.open(r5)     // Catch: java.lang.Throwable -> L4c java.io.IOException -> L4e
            java.lang.String r5 = "UTF-8"
            r3.<init>(r4, r5)     // Catch: java.lang.Throwable -> L4c java.io.IOException -> L4e
            r2.<init>(r3)     // Catch: java.lang.Throwable -> L4c java.io.IOException -> L4e
            java.lang.String r4 = r2.readLine()     // Catch: java.lang.Throwable -> L3d java.io.IOException -> L40
        L1a:
            if (r4 == 0) goto L43
            java.lang.String r5 = "#"
            java.lang.String[] r4 = r4.split(r5)     // Catch: java.lang.Throwable -> L3d java.io.IOException -> L40
            com.github.mikephil.charting.data.BarEntry r5 = new com.github.mikephil.charting.data.BarEntry     // Catch: java.lang.Throwable -> L3d java.io.IOException -> L40
            r1 = 1
            r1 = r4[r1]     // Catch: java.lang.Throwable -> L3d java.io.IOException -> L40
            float r1 = java.lang.Float.parseFloat(r1)     // Catch: java.lang.Throwable -> L3d java.io.IOException -> L40
            r3 = 0
            r4 = r4[r3]     // Catch: java.lang.Throwable -> L3d java.io.IOException -> L40
            float r4 = java.lang.Float.parseFloat(r4)     // Catch: java.lang.Throwable -> L3d java.io.IOException -> L40
            r5.<init>(r1, r4)     // Catch: java.lang.Throwable -> L3d java.io.IOException -> L40
            r0.add(r5)     // Catch: java.lang.Throwable -> L3d java.io.IOException -> L40
            java.lang.String r4 = r2.readLine()     // Catch: java.lang.Throwable -> L3d java.io.IOException -> L40
            goto L1a
        L3d:
            r4 = move-exception
            r1 = r2
            goto L58
        L40:
            r4 = move-exception
            r1 = r2
            goto L4f
        L43:
            r2.close()     // Catch: java.io.IOException -> L47
            return r0
        L47:
            r4 = move-exception
            r4.toString()
            goto L57
        L4c:
            r4 = move-exception
            goto L58
        L4e:
            r4 = move-exception
        L4f:
            r4.toString()     // Catch: java.lang.Throwable -> L4c
            if (r1 == 0) goto L57
            r1.close()     // Catch: java.io.IOException -> L47
        L57:
            return r0
        L58:
            if (r1 == 0) goto L62
            r1.close()     // Catch: java.io.IOException -> L5e
            goto L62
        L5e:
            r5 = move-exception
            r5.toString()
        L62:
            throw r4
    }

    public static java.util.List<com.github.mikephil.charting.data.Entry> loadEntriesFromAssets(android.content.res.AssetManager r6, java.lang.String r7) {
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            r1 = 0
            java.io.BufferedReader r2 = new java.io.BufferedReader     // Catch: java.lang.Throwable -> L73 java.io.IOException -> L75
            java.io.InputStreamReader r3 = new java.io.InputStreamReader     // Catch: java.lang.Throwable -> L73 java.io.IOException -> L75
            java.io.InputStream r6 = r6.open(r7)     // Catch: java.lang.Throwable -> L73 java.io.IOException -> L75
            java.lang.String r7 = "UTF-8"
            r3.<init>(r6, r7)     // Catch: java.lang.Throwable -> L73 java.io.IOException -> L75
            r2.<init>(r3)     // Catch: java.lang.Throwable -> L73 java.io.IOException -> L75
            java.lang.String r6 = r2.readLine()     // Catch: java.lang.Throwable -> L3d java.io.IOException -> L40
        L1a:
            if (r6 == 0) goto L6a
            java.lang.String r7 = "#"
            java.lang.String[] r6 = r6.split(r7)     // Catch: java.lang.Throwable -> L3d java.io.IOException -> L40
            int r7 = r6.length     // Catch: java.lang.Throwable -> L3d java.io.IOException -> L40
            r1 = 2
            r3 = 0
            r4 = 1
            if (r7 > r1) goto L43
            com.github.mikephil.charting.data.Entry r7 = new com.github.mikephil.charting.data.Entry     // Catch: java.lang.Throwable -> L3d java.io.IOException -> L40
            r1 = r6[r4]     // Catch: java.lang.Throwable -> L3d java.io.IOException -> L40
            float r1 = java.lang.Float.parseFloat(r1)     // Catch: java.lang.Throwable -> L3d java.io.IOException -> L40
            r6 = r6[r3]     // Catch: java.lang.Throwable -> L3d java.io.IOException -> L40
            float r6 = java.lang.Float.parseFloat(r6)     // Catch: java.lang.Throwable -> L3d java.io.IOException -> L40
            r7.<init>(r1, r6)     // Catch: java.lang.Throwable -> L3d java.io.IOException -> L40
            r0.add(r7)     // Catch: java.lang.Throwable -> L3d java.io.IOException -> L40
            goto L65
        L3d:
            r6 = move-exception
            r1 = r2
            goto L7f
        L40:
            r6 = move-exception
            r1 = r2
            goto L76
        L43:
            int r7 = r6.length     // Catch: java.lang.Throwable -> L3d java.io.IOException -> L40
            int r7 = r7 - r4
            float[] r1 = new float[r7]     // Catch: java.lang.Throwable -> L3d java.io.IOException -> L40
        L47:
            if (r3 >= r7) goto L54
            r5 = r6[r3]     // Catch: java.lang.Throwable -> L3d java.io.IOException -> L40
            float r5 = java.lang.Float.parseFloat(r5)     // Catch: java.lang.Throwable -> L3d java.io.IOException -> L40
            r1[r3] = r5     // Catch: java.lang.Throwable -> L3d java.io.IOException -> L40
            int r3 = r3 + 1
            goto L47
        L54:
            com.github.mikephil.charting.data.BarEntry r7 = new com.github.mikephil.charting.data.BarEntry     // Catch: java.lang.Throwable -> L3d java.io.IOException -> L40
            int r3 = r6.length     // Catch: java.lang.Throwable -> L3d java.io.IOException -> L40
            int r3 = r3 - r4
            r6 = r6[r3]     // Catch: java.lang.Throwable -> L3d java.io.IOException -> L40
            int r6 = java.lang.Integer.parseInt(r6)     // Catch: java.lang.Throwable -> L3d java.io.IOException -> L40
            float r6 = (float) r6     // Catch: java.lang.Throwable -> L3d java.io.IOException -> L40
            r7.<init>(r6, r1)     // Catch: java.lang.Throwable -> L3d java.io.IOException -> L40
            r0.add(r7)     // Catch: java.lang.Throwable -> L3d java.io.IOException -> L40
        L65:
            java.lang.String r6 = r2.readLine()     // Catch: java.lang.Throwable -> L3d java.io.IOException -> L40
            goto L1a
        L6a:
            r2.close()     // Catch: java.io.IOException -> L6e
            return r0
        L6e:
            r6 = move-exception
            r6.toString()
            goto L7e
        L73:
            r6 = move-exception
            goto L7f
        L75:
            r6 = move-exception
        L76:
            r6.toString()     // Catch: java.lang.Throwable -> L73
            if (r1 == 0) goto L7e
            r1.close()     // Catch: java.io.IOException -> L6e
        L7e:
            return r0
        L7f:
            if (r1 == 0) goto L89
            r1.close()     // Catch: java.io.IOException -> L85
            goto L89
        L85:
            r7 = move-exception
            r7.toString()
        L89:
            throw r6
    }

    public static java.util.List<com.github.mikephil.charting.data.Entry> loadEntriesFromFile(java.lang.String r7) {
            java.io.File r0 = android.os.Environment.getExternalStorageDirectory()
            java.io.File r1 = new java.io.File
            r1.<init>(r0, r7)
            java.util.ArrayList r7 = new java.util.ArrayList
            r7.<init>()
            java.io.BufferedReader r0 = new java.io.BufferedReader     // Catch: java.io.IOException -> L40
            java.io.FileReader r2 = new java.io.FileReader     // Catch: java.io.IOException -> L40
            r2.<init>(r1)     // Catch: java.io.IOException -> L40
            r0.<init>(r2)     // Catch: java.io.IOException -> L40
        L18:
            java.lang.String r1 = r0.readLine()     // Catch: java.io.IOException -> L40
            if (r1 == 0) goto L65
            java.lang.String r2 = "#"
            java.lang.String[] r1 = r1.split(r2)     // Catch: java.io.IOException -> L40
            int r2 = r1.length     // Catch: java.io.IOException -> L40
            r3 = 2
            r4 = 0
            r5 = 1
            if (r2 > r3) goto L42
            com.github.mikephil.charting.data.Entry r2 = new com.github.mikephil.charting.data.Entry     // Catch: java.io.IOException -> L40
            r3 = r1[r4]     // Catch: java.io.IOException -> L40
            float r3 = java.lang.Float.parseFloat(r3)     // Catch: java.io.IOException -> L40
            r1 = r1[r5]     // Catch: java.io.IOException -> L40
            int r1 = java.lang.Integer.parseInt(r1)     // Catch: java.io.IOException -> L40
            float r1 = (float) r1     // Catch: java.io.IOException -> L40
            r2.<init>(r3, r1)     // Catch: java.io.IOException -> L40
            r7.add(r2)     // Catch: java.io.IOException -> L40
            goto L18
        L40:
            r0 = move-exception
            goto L66
        L42:
            int r2 = r1.length     // Catch: java.io.IOException -> L40
            int r2 = r2 - r5
            float[] r3 = new float[r2]     // Catch: java.io.IOException -> L40
        L46:
            if (r4 >= r2) goto L53
            r6 = r1[r4]     // Catch: java.io.IOException -> L40
            float r6 = java.lang.Float.parseFloat(r6)     // Catch: java.io.IOException -> L40
            r3[r4] = r6     // Catch: java.io.IOException -> L40
            int r4 = r4 + 1
            goto L46
        L53:
            com.github.mikephil.charting.data.BarEntry r2 = new com.github.mikephil.charting.data.BarEntry     // Catch: java.io.IOException -> L40
            int r4 = r1.length     // Catch: java.io.IOException -> L40
            int r4 = r4 - r5
            r1 = r1[r4]     // Catch: java.io.IOException -> L40
            int r1 = java.lang.Integer.parseInt(r1)     // Catch: java.io.IOException -> L40
            float r1 = (float) r1     // Catch: java.io.IOException -> L40
            r2.<init>(r1, r3)     // Catch: java.io.IOException -> L40
            r7.add(r2)     // Catch: java.io.IOException -> L40
            goto L18
        L65:
            return r7
        L66:
            r0.toString()
            return r7
    }

    public static void saveToSdCard(java.util.List<com.github.mikephil.charting.data.Entry> r3, java.lang.String r4) {
            java.io.File r0 = android.os.Environment.getExternalStorageDirectory()
            java.io.File r1 = new java.io.File
            r1.<init>(r0, r4)
            boolean r4 = r1.exists()
            if (r4 != 0) goto L17
            r1.createNewFile()     // Catch: java.io.IOException -> L13
            goto L17
        L13:
            r4 = move-exception
            r4.toString()
        L17:
            java.io.BufferedWriter r4 = new java.io.BufferedWriter     // Catch: java.io.IOException -> L59
            java.io.FileWriter r0 = new java.io.FileWriter     // Catch: java.io.IOException -> L59
            r2 = 1
            r0.<init>(r1, r2)     // Catch: java.io.IOException -> L59
            r4.<init>(r0)     // Catch: java.io.IOException -> L59
            java.util.Iterator r3 = r3.iterator()     // Catch: java.io.IOException -> L59
        L26:
            boolean r0 = r3.hasNext()     // Catch: java.io.IOException -> L59
            if (r0 == 0) goto L55
            java.lang.Object r0 = r3.next()     // Catch: java.io.IOException -> L59
            com.github.mikephil.charting.data.Entry r0 = (com.github.mikephil.charting.data.Entry) r0     // Catch: java.io.IOException -> L59
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch: java.io.IOException -> L59
            r1.<init>()     // Catch: java.io.IOException -> L59
            float r2 = r0.getY()     // Catch: java.io.IOException -> L59
            r1.append(r2)     // Catch: java.io.IOException -> L59
            java.lang.String r2 = "#"
            r1.append(r2)     // Catch: java.io.IOException -> L59
            float r0 = r0.getX()     // Catch: java.io.IOException -> L59
            r1.append(r0)     // Catch: java.io.IOException -> L59
            java.lang.String r0 = r1.toString()     // Catch: java.io.IOException -> L59
            r4.append(r0)     // Catch: java.io.IOException -> L59
            r4.newLine()     // Catch: java.io.IOException -> L59
            goto L26
        L55:
            r4.close()     // Catch: java.io.IOException -> L59
            goto L5d
        L59:
            r3 = move-exception
            r3.toString()
        L5d:
            return
    }
}
