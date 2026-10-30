import Foundation
import Vision
import AppKit
let path = CommandLine.arguments[1]
guard let img = NSImage(contentsOfFile: path), let cg = img.cgImage(forProposedRect: nil, context: nil, hints: nil) else { exit(1) }
let req = VNRecognizeTextRequest { req, _ in
    if let obs = req.results as? [VNRecognizedTextObservation] {
        for o in obs { if let t = o.topCandidates(1).first { print(t.string) } }
    }
}
req.recognitionLevel = .accurate
req.usesLanguageCorrection = false
let h = VNImageRequestHandler(cgImage: cg, options: [:])
try? h.perform([req])
