# MediTrack

MediTrack ist eine medizinische Desktop-Anwendung, die zur Verwaltung von Patientenakten und Medikamenten entwickelt wurde. Das Ziel dieses Projekts ist es, Pflegekräften eine einfache und übersichtliche Plattform zur Verfügung zu stellen, um die Versorgung von Patienten effizienter zu gestalten.

## Funktionen

- **Übersicht der Patienten**: Startseite mit einer Liste aller Patienten, die über die Anwendung verwaltet werden.
- **Patientenakte anzeigen und bearbeiten**: Durch einen Doppelklick auf einen Patienten öffnet sich die Akte, die bearbeitet werden kann.
- **Medikamentenverwaltung**: Eine Liste der aktuellen Medikamente jedes Patienten, inklusive Bestandsüberwachung.
- **Automatische Benachrichtigungen**: Wenn der Bestand eines Medikaments zu niedrig ist, wird automatisch eine Nachricht an die Pflegestelle gesendet, um das Medikament nachzubestellen.
- **Synchronisation mit der Pflegeverwaltungsstelle**: Pflegekräfte können Änderungen mit der zentralen Pflegeverwaltung synchronisieren, um die Versorgung stets auf dem neuesten Stand zu halten.

## Technologien

- **Programmiersprache**: Java
- **Entwicklungsumgebung**: IntelliJ Community Edition
- **Datenbank**: MySQL (für die Patientendaten)
- **Versionierung**: Git, GitHub Repository für die Projektverwaltung

## Installation

1. **Clone Repository**: Klone das Projekt auf deinen Rechner:
   ```
   git clone https://github.com/dein-github-username/MediTrack.git
   ```
2. **Importiere das Projekt**: Importiere das Projekt in deine Entwicklungsumgebung (z.B. IntelliJ).
3. **Datenbank einrichten**: Stelle sicher, dass MySQL installiert ist, und richte die Datenbank entsprechend der `schema.sql` Datei im Projekt ein.
4. **Run**: Starte die Anwendung in deiner IDE.

## Benutzung

- Nach dem Starten der Anwendung kannst du dich mit deinem Benutzernamen und Passwort anmelden.
- Navigiere zur Übersicht, um Patienten zu sehen, und doppelklicke, um Akten zu bearbeiten.
- Die Medikamentenverwaltung ist über die Patientenakte verfügbar.

## Beitragen

Beiträge sind willkommen! Wenn du Ideen für neue Funktionen oder Fehlerbehebungen hast:
1. Forke das Repository.
2. Erstelle einen neuen Branch (`git checkout -b feature/dein-feature-name`).
3. Nimm deine Änderungen vor und committe sie (`git commit -m 'Beschreibung der Änderung'`).
4. Push deinen Branch (`git push origin feature/dein-feature-name`).
5. Erstelle einen Pull Request.

## Lizenz

Dieses Projekt ist unter der Creative Commons BY-NC-SA 4.0 Lizenz lizenziert. Das bedeutet, dass das Projekt nicht für kommerzielle Zwecke verwendet oder verkauft werden darf. Siehe die `LICENSE` Datei für weitere Informationen.
