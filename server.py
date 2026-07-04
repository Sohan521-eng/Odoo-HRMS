# server.py
# A conceptual Flask backend for OdooSync HR

from flask import Flask, jsonify, send_from_directory
import os

app = Flask(__name__, static_folder='../frontend')

# 1. Serve the frontend application
@app.route('/')
def serve_dashboard():
    return send_from_directory(app.static_folder, 'index.html')

# 2. Serve static assets (CSS, JS)
@app.route('/<path:path>')
def serve_static(path):
    return send_from_directory(app.static_folder, path)

# 3. Example API Route: Mark Attendance
@app.route('/api/attendance/mark', methods=['POST'])
def mark_attendance():
    # In the future, this is where you would connect to your SQL database
    # and update the employee's attendance record.
    return jsonify({
        "status": "success",
        "message": "Biometric attendance recorded successfully.",
        "timestamp": "08:58:12 AM"
    })

if __name__ == '__main__':
    print("Starting OdooSync Enterprise Server on port 5000...")
    app.run(debug=True, port=5000)