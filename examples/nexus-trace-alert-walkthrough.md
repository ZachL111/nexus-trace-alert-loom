# Nexus Trace Alert Loom Walkthrough

I use this file as a small checklist before changing the Scala implementation.

| Case | Focus | Score | Lane |
| --- | --- | ---: | --- |
| baseline | span volume | 194 | ship |
| stress | latency skew | 190 | ship |
| edge | signal loss | 162 | ship |
| recovery | incident shape | 204 | ship |
| stale | span volume | 210 | ship |

Start with `stale` and `edge`. They create the widest contrast in this repository's fixture set, which makes them better review anchors than the middle cases.

If `edge` becomes less cautious without a clear reason, I would inspect the drag input first.
