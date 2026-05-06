# Review Journal

The repository goal stays the same: package a Scala local lab for alert analysis with capacity fixtures, allocation and spill reports, and documented operating limits. This note explains the added review angle.

The local checks classify each case as `ship`, `watch`, or `hold`. That gives the project a small review vocabulary that matches its observability focus without claiming live deployment or external usage.

## Cases

- `baseline`: `span volume`, score 194, lane `ship`
- `stress`: `latency skew`, score 190, lane `ship`
- `edge`: `signal loss`, score 162, lane `ship`
- `recovery`: `incident shape`, score 204, lane `ship`
- `stale`: `span volume`, score 210, lane `ship`

## Note

This file is intentionally plain so the fixture remains the source of truth.
